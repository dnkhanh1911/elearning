package project.learning.dto.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private int userId;
    private String full_name;
    private String email;
    private String roleId;
    private byte is_verify;
    private Date date_of_birth;
    private String phone;
    private Byte gender;
}
