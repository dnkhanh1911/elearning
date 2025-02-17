package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Reviewreport {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ReviewReportID", nullable = false)
    private int reviewReportId;
    @Basic
    @Column(name = "UserID", nullable = true)
    private Integer userId;
    @Basic
    @Column(name = "ReviewID", nullable = true)
    private Integer reviewId;
    @Basic
    @Column(name = "ProblemID", nullable = true)
    private Integer problemId;
    @Basic
    @Column(name = "Reason", nullable = true, length = 511)
    private String reason;
    @Basic
    @Column(name = "ReportDate", nullable = true)
    private Timestamp reportDate;

    public int getReviewReportId() {
        return reviewReportId;
    }

    public void setReviewReportId(int reviewReportId) {
        this.reviewReportId = reviewReportId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Timestamp getReportDate() {
        return reportDate;
    }

    public void setReportDate(Timestamp reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reviewreport that = (Reviewreport) o;
        return reviewReportId == that.reviewReportId && Objects.equals(userId, that.userId) && Objects.equals(reviewId, that.reviewId) && Objects.equals(problemId, that.problemId) && Objects.equals(reason, that.reason) && Objects.equals(reportDate, that.reportDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewReportId, userId, reviewId, problemId, reason, reportDate);
    }
}
