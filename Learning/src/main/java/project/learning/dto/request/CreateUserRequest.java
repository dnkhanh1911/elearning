package project.learning.dto.request;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;

import java.sql.Date;

public class CreateUserRequest {
    private String fullName;
    private String email;
    private int roleId;
    private byte isVerify;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public byte getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(byte isVerify) {
        this.isVerify = isVerify;
    }
}
