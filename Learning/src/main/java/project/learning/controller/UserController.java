package project.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.learning.dto.request.CreateUserRequest;
import project.learning.entity.UserEntity;
import project.learning.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    UserEntity createUser(@RequestBody CreateUserRequest request){
        return userService.createUser(request);
    }
    @GetMapping
    List<UserEntity> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/{id}")
    UserEntity getUser(@PathVariable int id){
        return userService.getUser(id);
    }
    @PutMapping("/{id}")
    UserEntity updateUser(@PathVariable int id, @RequestBody CreateUserRequest request){
        return userService.updateUser(id,request);
    }
    @DeleteMapping("{id}")
    String deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return "Xoa thhanh cong";
    }
}
