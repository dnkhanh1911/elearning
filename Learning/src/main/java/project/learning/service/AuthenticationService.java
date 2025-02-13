package project.learning.service;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.learning.dto.request.AuthenticationRequest;
import project.learning.dto.request.VerifyTokenRequest;
import project.learning.dto.response.AuthenticationResponse;
import project.learning.dto.response.VerifyTokenResponse;
import project.learning.exception.AppException;
import project.learning.exception.ErrorCode;
import project.learning.repository.UserRepository;

import java.text.ParseException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class    AuthenticationService {
    private final UserRepository userRepository;
    @NonFinal
    @Value("${jwt.secret}")
    protected String SECRET_KEY;

    public VerifyTokenResponse verifyToken(VerifyTokenRequest request) throws JOSEException, ParseException {
        var token = request.getToken();
        JWSVerifier verifier = new MACVerifier(SECRET_KEY.getBytes());

        SignedJWT signedJWT = SignedJWT.parse(token);

        var verified = signedJWT.verify(verifier);

        Date expiridTime = signedJWT.getJWTClaimsSet().getExpirationTime();

        return VerifyTokenResponse.builder()
                .valid( verified && expiridTime.after(new Date()))
                .build();
    }
    public AuthenticationResponse authen(AuthenticationRequest request){
        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(()-> new AppException(ErrorCode.EMAIL_NOT_EXISTED));

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean authenticated = passwordEncoder.matches(request.getPassword(), user.getPassword());
        if(!authenticated){
            throw new AppException(ErrorCode.UNAUTHENTICATED);
        }

        var token = generateToken(request.getEmail());

        return AuthenticationResponse.builder()
                .token(token)
                .authenticated(true)
                .build();

    }

    private String generateToken(String email){
        JWSHeader header = new JWSHeader(JWSAlgorithm.HS512);

        JWTClaimsSet jwtClaimsSet = new JWTClaimsSet.Builder()
                .subject(email)
                .issuer("namkhanh")
                .issueTime(new Date())
                .expirationTime(new Date(Instant.now().plus(1, ChronoUnit.HOURS).toEpochMilli()))
                .claim("customClaim", "custom")
                .build();

        Payload payload = new Payload(jwtClaimsSet.toJSONObject());

        JWSObject jwsObject = new JWSObject(header,payload);

        try {
            jwsObject.sign(new MACSigner(SECRET_KEY.getBytes()));
            return jwsObject.serialize();
        } catch (JOSEException e) {
            throw new RuntimeException(e);
        }
    }
}
