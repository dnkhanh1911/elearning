package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Replyreaction {
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
    @jakarta.persistence.Column(name = "ReplyID", nullable = false)
    private int replyId;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
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
    @Column(name = "isDislike", nullable = false)
    private byte isDislike;

    public byte getIsDislike() {
        return isDislike;
    }

    public void setIsDislike(byte isDislike) {
        this.isDislike = isDislike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Replyreaction that = (Replyreaction) o;
        return userId == that.userId && replyId == that.replyId && isLike == that.isLike && isDislike == that.isDislike;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, replyId, isLike, isDislike);
    }
}
