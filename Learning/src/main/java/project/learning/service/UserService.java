package project.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.learning.dto.request.CreateUserRequest;
import project.learning.entity.UserEntity;
import project.learning.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserEntity createUser(CreateUserRequest request){
        UserEntity user = new UserEntity();

        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setRoleId(request.getRoleId());
        user.setIsVerify(request.getIsVerify());

        return userRepository.save(user);
    }

    public List<UserEntity> getUsers(){
        return userRepository.findAll();
    }

    public UserEntity getUser(int id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public UserEntity updateUser(int id, CreateUserRequest request){
        UserEntity user = getUser(id);
        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setRoleId(request.getRoleId());
        user.setIsVerify(request.getIsVerify());

        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.delete(getUser(id));
    }
}
