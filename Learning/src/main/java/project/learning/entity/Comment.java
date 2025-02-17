package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Comment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CommentID", nullable = false)
    private int commentId;
    @Basic
    @Column(name = "LessonID", nullable = false)
    private int lessonId;
    @Basic
    @Column(name = "UserID", nullable = false)
    private int userId;
    @Basic
    @Column(name = "Content", nullable = false, length = 500)
    private String content;
    @Basic
    @Column(name = "Like", nullable = false)
    private int like;
    @Basic
    @Column(name = "Dislike", nullable = false)
    private int dislike;
    @Basic
    @Column(name = "IsReply", nullable = false)
    private byte isReply;
    @Basic
    @Column(name = "Image", nullable = true, length = 100)
    private String image;
    @Basic
    @Column(name = "Status", nullable = false)
    private byte status;
    @Basic
    @Column(name = "CommentDate", nullable = true)
    private Timestamp commentDate;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public byte getIsReply() {
        return isReply;
    }

    public void setIsReply(byte isReply) {
        this.isReply = isReply;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Timestamp getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return commentId == comment.commentId && lessonId == comment.lessonId && userId == comment.userId && like == comment.like && dislike == comment.dislike && isReply == comment.isReply && status == comment.status && Objects.equals(content, comment.content) && Objects.equals(image, comment.image) && Objects.equals(commentDate, comment.commentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, lessonId, userId, content, like, dislike, isReply, image, status, commentDate);
    }
}
