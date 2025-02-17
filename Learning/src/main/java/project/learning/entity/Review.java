package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Review {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ReviewID", nullable = false)
    private int reviewId;
    @Basic
    @Column(name = "UserID", nullable = false)
    private int userId;
    @Basic
    @Column(name = "CourseID", nullable = false)
    private int courseId;
    @Basic
    @Column(name = "Rating", nullable = true)
    private Integer rating;
    @Basic
    @Column(name = "Time", nullable = true)
    private Timestamp time;
    @Basic
    @Column(name = "ReviewContent", nullable = true, length = 500)
    private String reviewContent;
    @Basic
    @Column(name = "isReport", nullable = true)
    private Byte isReport;

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
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

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public Byte getIsReport() {
        return isReport;
    }

    public void setIsReport(Byte isReport) {
        this.isReport = isReport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return reviewId == review.reviewId && userId == review.userId && courseId == review.courseId && Objects.equals(rating, review.rating) && Objects.equals(time, review.time) && Objects.equals(reviewContent, review.reviewContent) && Objects.equals(isReport, review.isReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewId, userId, courseId, rating, time, reviewContent, isReport);
    }
}
