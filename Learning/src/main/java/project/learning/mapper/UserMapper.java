package project.learning.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import project.learning.dto.request.CreateUserRequest;
import project.learning.dto.response.UserResponse;
import project.learning.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toUser(CreateUserRequest request);
    UserResponse toUserResponse(UserEntity user);
    void updateUser(@MappingTarget UserEntity user, CreateUserRequest request);
}
