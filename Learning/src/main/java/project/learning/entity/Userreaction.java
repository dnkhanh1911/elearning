package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Userreaction {
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
    @jakarta.persistence.Column(name = "CommentID", nullable = false)
    private int commentId;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "isLike", nullable = false)
    private byte isLike;

    public byte getIsLike() {
        return isLike;
    }

    public void setIsLike(byte isLike) {
        this.isLike = isLike;
    }

    @Basic
    @Column(name = "isDisLike", nullable = false)
    private byte isDisLike;

    public byte getIsDisLike() {
        return isDisLike;
    }

    public void setIsDisLike(byte isDisLike) {
        this.isDisLike = isDisLike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userreaction that = (Userreaction) o;
        return userId == that.userId && commentId == that.commentId && isLike == that.isLike && isDisLike == that.isDisLike;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, commentId, isLike, isDisLike);
    }
}
