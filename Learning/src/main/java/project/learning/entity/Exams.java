package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Exams {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ExamID", nullable = false)
    private int examId;
    @Basic
    @Column(name = "ExamName", nullable = false, length = 100)
    private String examName;
    @Basic
    @Column(name = "CourseID", nullable = false)
    private int courseId;
    @Basic
    @Column(name = "Duration", nullable = false)
    private int duration;
    @Basic
    @Column(name = "Quantity", nullable = false)
    private int quantity;

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exams exams = (Exams) o;
        return examId == exams.examId && courseId == exams.courseId && duration == exams.duration && quantity == exams.quantity && Objects.equals(examName, exams.examName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, examName, courseId, duration, quantity);
    }
}
