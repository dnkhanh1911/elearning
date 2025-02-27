package project.learning.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
    private String full_name;
    @Email(message = "Must be email")
    private String email;
    private String password;
    private String confirmPassword;
    private Date date_of_birth;
    private String phone;
    private Byte gender;
    private Byte is_verify;
}
