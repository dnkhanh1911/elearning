package project.learning.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.learning.dto.request.CreateUserRequest;
import project.learning.dto.response.ApiResponse;
import project.learning.dto.response.UserResponse;
import project.learning.entity.User;
import project.learning.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    ApiResponse<UserResponse> createUser(@RequestBody @Valid CreateUserRequest request){
        ApiResponse<UserResponse> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createUser(request));
        return apiResponse;
    }
    @GetMapping
    ApiResponse<List<UserResponse>> getUsers(){
        return ApiResponse.<List<UserResponse>>builder()
                .result(userService.getUsers())
                .build();
    }
    @GetMapping("/{id}")
    UserResponse getUser(@PathVariable int id){
        return userService.getUser(id);
    }
    @PutMapping("/{id}")
    UserResponse updateUser(@PathVariable int id, @RequestBody CreateUserRequest request){
        return userService.updateUser(id,request);
    }
    @DeleteMapping("{id}")
    String deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return "Xoa thhanh cong";
    }
}
