package project.learning.controller;

import com.nimbusds.jose.JOSEException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.learning.dto.request.AuthenticationRequest;
import project.learning.dto.request.VerifyTokenRequest;
import project.learning.dto.response.ApiResponse;
import project.learning.dto.response.AuthenticationResponse;
import project.learning.dto.response.VerifyTokenResponse;
import project.learning.service.AuthenticationService;

import java.text.ParseException;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    @PostMapping("/login")
    ApiResponse<AuthenticationResponse> login(@RequestBody AuthenticationRequest request){
        var result = authenticationService.authen(request);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(result)
                .build();
    }
    @PostMapping("/token")
    ApiResponse<VerifyTokenResponse> token(@RequestBody VerifyTokenRequest request) throws ParseException, JOSEException {
        var result = authenticationService.verifyToken(request);
        return ApiResponse.<VerifyTokenResponse>builder()
                .result(result)
                .build();
    }
}
