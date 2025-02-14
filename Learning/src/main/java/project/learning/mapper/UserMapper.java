package project.learning.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import project.learning.dto.request.CreateUserRequest;
import project.learning.dto.response.UserResponse;
import project.learning.entity.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(CreateUserRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, CreateUserRequest request);
}
