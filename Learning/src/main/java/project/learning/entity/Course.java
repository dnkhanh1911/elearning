package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Course {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CourseID", nullable = false)
    private int courseId;
    @Basic
    @Column(name = "UserID", nullable = true)
    private Integer userId;
    @Basic
    @Column(name = "CategoryID", nullable = false)
    private int categoryId;
    @Basic
    @Column(name = "CourseImg", nullable = true, length = 500)
    private String courseImg;
    @Basic
    @Column(name = "CourseName", nullable = false, length = 300)
    private String courseName;
    @Basic
    @Column(name = "Publish", nullable = false)
    private Date publish;
    @Basic
    @Column(name = "Duration", nullable = true, precision = 0)
    private Double duration;
    @Basic
    @Column(name = "Report", nullable = true, length = 500)
    private String report;
    @Basic
    @Column(name = "IsDiscontinued", nullable = true)
    private Byte isDiscontinued;
    @Basic
    @Column(name = "newVersionId", nullable = true)
    private Integer newVersionId;
    @Basic
    @Column(name = "Description", nullable = false, length = -1)
    private String description;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getPublish() {
        return publish;
    }

    public void setPublish(Date publish) {
        this.publish = publish;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Byte getIsDiscontinued() {
        return isDiscontinued;
    }

    public void setIsDiscontinued(Byte isDiscontinued) {
        this.isDiscontinued = isDiscontinued;
    }

    public Integer getNewVersionId() {
        return newVersionId;
    }

    public void setNewVersionId(Integer newVersionId) {
        this.newVersionId = newVersionId;
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
        Course course = (Course) o;
        return courseId == course.courseId && categoryId == course.categoryId && Objects.equals(userId, course.userId) && Objects.equals(courseImg, course.courseImg) && Objects.equals(courseName, course.courseName) && Objects.equals(publish, course.publish) && Objects.equals(duration, course.duration) && Objects.equals(report, course.report) && Objects.equals(isDiscontinued, course.isDiscontinued) && Objects.equals(newVersionId, course.newVersionId) && Objects.equals(description, course.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, userId, categoryId, courseImg, courseName, publish, duration, report, isDiscontinued, newVersionId, description);
    }
}
