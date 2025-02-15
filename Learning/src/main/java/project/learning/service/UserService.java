package project.learning.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.learning.dto.request.CreateUserRequest;
import project.learning.dto.response.UserResponse;
import project.learning.entity.User;
import project.learning.enums.Role;
import project.learning.exception.AppException;
import project.learning.exception.ErrorCode;
import project.learning.mapper.UserMapper;
import project.learning.repository.UserRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    public UserResponse createUser(CreateUserRequest request){

        if(userRepository.existsByEmail(request.getEmail())){
            throw new AppException(ErrorCode.EMAIL_EXISTED);
        }

        User user = userMapper.toUser(request);

        user.setRoleId(Role.STUDENT.name());

        user.setPassword(passwordEncoder.encode(request.getPassword()));

        return userMapper.toUserResponse(userRepository.save(user));
    }
    @PreAuthorize("hasRole('STUDENT')")
    public List<UserResponse> getUsers(){
        return userRepository.findAll().stream().map(userMapper::toUserResponse).toList();
    }

    public UserResponse getMyInfo(){
        var context = SecurityContextHolder.getContext();
        String name = context.getAuthentication().getName();
        User user = userRepository.findByEmail(name).orElseThrow(()->
                new AppException(ErrorCode.EMAIL_NOT_EXISTED));
        return userMapper.toUserResponse(user);
    }


    @PreAuthorize("hasRole('STUDENT')")
    @PostAuthorize("returnObject.email == authentication.name")
    public UserResponse getUser(int id){
        return userMapper.toUserResponse(userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found")));
    }

    public UserResponse updateUser(int id, CreateUserRequest request){
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        userMapper.updateUser(user,request);

        return userMapper.toUserResponse(userRepository.save(user));
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
