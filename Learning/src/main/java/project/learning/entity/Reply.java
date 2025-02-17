package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Reply {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ReplyID", nullable = false)
    private int replyId;
    @Basic
    @Column(name = "CommentID", nullable = false)
    private int commentId;
    @Basic
    @Column(name = "UserID", nullable = false)
    private int userId;
    @Basic
    @Column(name = "Content", nullable = false, length = 500)
    private String content;
    @Basic
    @Column(name = "DateReply", nullable = false)
    private Timestamp dateReply;
    @Basic
    @Column(name = "Image", nullable = true, length = 100)
    private String image;
    @Basic
    @Column(name = "Status", nullable = false)
    private byte status;
    @Basic
    @Column(name = "Like", nullable = true, length = 100)
    private String like;
    @Basic
    @Column(name = "Dislike", nullable = true, length = 100)
    private String dislike;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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

    public Timestamp getDateReply() {
        return dateReply;
    }

    public void setDateReply(Timestamp dateReply) {
        this.dateReply = dateReply;
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

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getDislike() {
        return dislike;
    }

    public void setDislike(String dislike) {
        this.dislike = dislike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reply reply = (Reply) o;
        return replyId == reply.replyId && commentId == reply.commentId && userId == reply.userId && status == reply.status && Objects.equals(content, reply.content) && Objects.equals(dateReply, reply.dateReply) && Objects.equals(image, reply.image) && Objects.equals(like, reply.like) && Objects.equals(dislike, reply.dislike);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replyId, commentId, userId, content, dateReply, image, status, like, dislike);
    }
}
