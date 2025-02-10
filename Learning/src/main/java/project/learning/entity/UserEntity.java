package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(schema = "elearning", catalog = "")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(nullable = false)
    private int userId;
    @Basic
    @Column(nullable = false, length = 200)
    private String fullName;
    @Basic
    @Column(nullable = true)
    private Date dateOfBirth;
    @Basic
    @Column(nullable = false, length = 200)
    private String email;
    @Basic
    @Column(nullable = true, length = 500)
    private String password;
    @Basic
    @Column(nullable = true, length = 100)
    private String phone;
    @Basic
    @Column(nullable = true, length = 300)
    private String address;
    @Basic
    @Column(nullable = true)
    private Byte gender;
    @Basic
    @Column(nullable = false)
    private int roleId;
    @Basic
    @Column(nullable = true, length = 500)
    private String reason;
    @Basic
    @Column(nullable = true)
    private Date timeBan;
    @Basic
    @Column(nullable = true, length = 400)
    private String avatar;
    @Basic
    @Column(nullable = false)
    private byte isVerify;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOrBirth) {
        this.dateOfBirth = dateOrBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getTimeBan() {
        return timeBan;
    }

    public void setTimeBan(Date timeBan) {
        this.timeBan = timeBan;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public byte getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(byte isVerify) {
        this.isVerify = isVerify;
    }

}
