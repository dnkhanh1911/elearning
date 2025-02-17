package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Enroll {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "UserID", nullable = false)
    private int userId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CourseID", nullable = false)
    private int courseId;
    @Basic
    @Column(name = "Status", nullable = false)
    private byte status;
    @Basic
    @Column(name = "Progress", nullable = false)
    private int progress;
    @Basic
    @Column(name = "DateEnroll", nullable = false)
    private Date dateEnroll;

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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public Date getDateEnroll() {
        return dateEnroll;
    }

    public void setDateEnroll(Date dateEnroll) {
        this.dateEnroll = dateEnroll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enroll enroll = (Enroll) o;
        return userId == enroll.userId && courseId == enroll.courseId && status == enroll.status && progress == enroll.progress && Objects.equals(dateEnroll, enroll.dateEnroll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, courseId, status, progress, dateEnroll);
    }
}
