package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Examdetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ExamDetailID", nullable = false)
    private int examDetailId;
    @Basic
    @Column(name = "UserID", nullable = false)
    private int userId;
    @Basic
    @Column(name = "ExamID", nullable = false)
    private int examId;
    @Basic
    @Column(name = "TimeStart", nullable = true)
    private Timestamp timeStart;
    @Basic
    @Column(name = "TimeEnd", nullable = false)
    private Timestamp timeEnd;
    @Basic
    @Column(name = "Status", nullable = false)
    private byte status;
    @Basic
    @Column(name = "Score", nullable = false, precision = 0)
    private double score;

    public int getExamDetailId() {
        return examDetailId;
    }

    public void setExamDetailId(int examDetailId) {
        this.examDetailId = examDetailId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    public Timestamp getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Timestamp timeEnd) {
        this.timeEnd = timeEnd;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Examdetail that = (Examdetail) o;
        return examDetailId == that.examDetailId && userId == that.userId && examId == that.examId && status == that.status && Double.compare(score, that.score) == 0 && Objects.equals(timeStart, that.timeStart) && Objects.equals(timeEnd, that.timeEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examDetailId, userId, examId, timeStart, timeEnd, status, score);
    }
}
