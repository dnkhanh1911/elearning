package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Certificate {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CertificateID", nullable = false)
    private int certificateId;
    @Basic
    @Column(name = "UserID", nullable = false)
    private int userId;
    @Basic
    @Column(name = "CourseID", nullable = false)
    private int courseId;
    @Basic
    @Column(name = "Date", nullable = false)
    private Date date;
    @Basic
    @Column(name = "Satus", nullable = true, length = 100)
    private String satus;

    public int getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSatus() {
        return satus;
    }

    public void setSatus(String satus) {
        this.satus = satus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Certificate that = (Certificate) o;
        return certificateId == that.certificateId && userId == that.userId && courseId == that.courseId && Objects.equals(date, that.date) && Objects.equals(satus, that.satus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateId, userId, courseId, date, satus);
    }
}
