package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Mooc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MoocID", nullable = false)
    private int moocId;
    @Basic
    @Column(name = "MoocNumber", nullable = false)
    private int moocNumber;
    @Basic
    @Column(name = "MoocName", nullable = false, length = 400)
    private String moocName;
    @Basic
    @Column(name = "CourseID", nullable = false)
    private int courseId;

    public int getMoocId() {
        return moocId;
    }

    public void setMoocId(int moocId) {
        this.moocId = moocId;
    }

    public int getMoocNumber() {
        return moocNumber;
    }

    public void setMoocNumber(int moocNumber) {
        this.moocNumber = moocNumber;
    }

    public String getMoocName() {
        return moocName;
    }

    public void setMoocName(String moocName) {
        this.moocName = moocName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mooc mooc = (Mooc) o;
        return moocId == mooc.moocId && moocNumber == mooc.moocNumber && courseId == mooc.courseId && Objects.equals(moocName, mooc.moocName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moocId, moocNumber, moocName, courseId);
    }
}
