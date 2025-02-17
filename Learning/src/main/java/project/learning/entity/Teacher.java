package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Teacher {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TeacherID", nullable = false)
    private int teacherId;
    @Basic
    @Column(name = "UserID", nullable = false)
    private int userId;
    @Basic
    @Column(name = "Position", nullable = false, length = 100)
    private String position;
    @Basic
    @Column(name = "Workplace", nullable = true, length = 100)
    private String workplace;
    @Basic
    @Column(name = "PersonalWebsite", nullable = true, length = 100)
    private String personalWebsite;
    @Basic
    @Column(name = "Facebook", nullable = true, length = 100)
    private String facebook;
    @Basic
    @Column(name = "Linkedin", nullable = true, length = 100)
    private String linkedin;
    @Basic
    @Column(name = "DateJoin", nullable = true)
    private Timestamp dateJoin;
    @Basic
    @Column(name = "About", nullable = false, length = -1)
    private String about;
    @Basic
    @Column(name = "CV", nullable = false, length = 500)
    private String cv;
    @Basic
    @Column(name = "Status", nullable = true)
    private Byte status;
    @Basic
    @Column(name = "DateRequest", nullable = true)
    private Timestamp dateRequest;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getPersonalWebsite() {
        return personalWebsite;
    }

    public void setPersonalWebsite(String personalWebsite) {
        this.personalWebsite = personalWebsite;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public Timestamp getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(Timestamp dateJoin) {
        this.dateJoin = dateJoin;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Timestamp getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(Timestamp dateRequest) {
        this.dateRequest = dateRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teacherId == teacher.teacherId && userId == teacher.userId && Objects.equals(position, teacher.position) && Objects.equals(workplace, teacher.workplace) && Objects.equals(personalWebsite, teacher.personalWebsite) && Objects.equals(facebook, teacher.facebook) && Objects.equals(linkedin, teacher.linkedin) && Objects.equals(dateJoin, teacher.dateJoin) && Objects.equals(about, teacher.about) && Objects.equals(cv, teacher.cv) && Objects.equals(status, teacher.status) && Objects.equals(dateRequest, teacher.dateRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, userId, position, workplace, personalWebsite, facebook, linkedin, dateJoin, about, cv, status, dateRequest);
    }
}
