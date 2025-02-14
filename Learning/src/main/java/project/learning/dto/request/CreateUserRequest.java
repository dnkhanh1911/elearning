package project.learning.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
    private String fullName;
    @Email(message = "Must be email")
    private String email;
    private String password;
    private byte isVerify;

}
