package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Lessons {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LessonID", nullable = false)
    private int lessonId;
    @Basic
    @Column(name = "LessonNumber", nullable = false)
    private int lessonNumber;
    @Basic
    @Column(name = "LessonName", nullable = false, length = 300)
    private String lessonName;
    @Basic
    @Column(name = "MoocID", nullable = false)
    private int moocId;
    @Basic
    @Column(name = "LessonUrl", nullable = false, length = 300)
    private String lessonUrl;
    @Basic
    @Column(name = "Description", nullable = false, length = 500)
    private String description;

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getMoocId() {
        return moocId;
    }

    public void setMoocId(int moocId) {
        this.moocId = moocId;
    }

    public String getLessonUrl() {
        return lessonUrl;
    }

    public void setLessonUrl(String lessonUrl) {
        this.lessonUrl = lessonUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lessons lessons = (Lessons) o;
        return lessonId == lessons.lessonId && lessonNumber == lessons.lessonNumber && moocId == lessons.moocId && Objects.equals(lessonName, lessons.lessonName) && Objects.equals(lessonUrl, lessons.lessonUrl) && Objects.equals(description, lessons.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lessonId, lessonNumber, lessonName, moocId, lessonUrl, description);
    }
}
