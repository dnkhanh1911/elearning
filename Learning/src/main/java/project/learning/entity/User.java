package project.learning.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "users",schema = "elearning")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id",nullable = false)
    private int userId;
    @Column(nullable = false, length = 200)
    private String fullName;
    @Column(nullable = true)
    private Date dateOfBirth;
    @Column(nullable = false, length = 200)
    private String email;
    @Column(nullable = true, length = 500)
    private String password;
    @Column(nullable = true, length = 100)
    private String phone;
    @Column(nullable = true, length = 300)
    private String address;
    @Column(nullable = true)
    private Byte gender;
    @Column(nullable = false)
    private String roleId;
    @Column(nullable = true, length = 500)
    private String reason;
    @Column(nullable = true)
    private Date timeBan;
    @Column(nullable = true, length = 400)
    private String avatar;
    @Column(nullable = false)
    private byte isVerify;

}
