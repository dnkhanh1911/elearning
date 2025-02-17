package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Progress2 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "UserID", nullable = false)
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "CourseID", nullable = false)
    private int courseId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "NumberLearned", nullable = false)
    private int numberLearned;

    public int getNumberLearned() {
        return numberLearned;
    }

    public void setNumberLearned(int numberLearned) {
        this.numberLearned = numberLearned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Progress2 progress2 = (Progress2) o;
        return userId == progress2.userId && courseId == progress2.courseId && numberLearned == progress2.numberLearned;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, courseId, numberLearned);
    }
}
