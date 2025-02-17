package project.learning.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Notification {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NotificationID", nullable = false)
    private int notificationId;
    @Basic
    @Column(name = "FromUserID", nullable = false)
    private int fromUserId;
    @Basic
    @Column(name = "Content", nullable = false, length = 500)
    private String content;
    @Basic
    @Column(name = "Link", nullable = true, length = 500)
    private String link;
    @Basic
    @Column(name = "Date", nullable = false)
    private Timestamp date;
    @Basic
    @Column(name = "IsRead", nullable = false)
    private byte isRead;
    @Basic
    @Column(name = "ToUserID", nullable = false)
    private int toUserId;

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public byte getIsRead() {
        return isRead;
    }

    public void setIsRead(byte isRead) {
        this.isRead = isRead;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return notificationId == that.notificationId && fromUserId == that.fromUserId && isRead == that.isRead && toUserId == that.toUserId && Objects.equals(content, that.content) && Objects.equals(link, that.link) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, fromUserId, content, link, date, isRead, toUserId);
    }
}
