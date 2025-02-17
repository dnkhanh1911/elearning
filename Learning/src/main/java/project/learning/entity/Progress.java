package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Progress {
    @Basic
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "UserID", nullable = false)
    private int userId;
    @Basic
    @Column(name = "LessonID", nullable = false)
    private int lessonId;
    @Basic
    @Column(name = "State", nullable = true)
    private Byte state;
    @Basic
    @Column(name = "CourseID", nullable = true)
    private Integer courseId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Progress progress = (Progress) o;
        return userId == progress.userId && lessonId == progress.lessonId && Objects.equals(state, progress.state) && Objects.equals(courseId, progress.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, lessonId, state, courseId);
    }
}
