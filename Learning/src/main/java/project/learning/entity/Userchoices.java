package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Userchoices {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "UserChoiceID", nullable = false)
    private int userChoiceId;

    public int getUserChoiceId() {
        return userChoiceId;
    }

    public void setUserChoiceId(int userChoiceId) {
        this.userChoiceId = userChoiceId;
    }

    @Basic
    @Column(name = "ExamDetailID", nullable = false)
    private int examDetailId;

    public int getExamDetailId() {
        return examDetailId;
    }

    public void setExamDetailId(int examDetailId) {
        this.examDetailId = examDetailId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ChoiceID", nullable = false)
    private int choiceId;

    public int getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(int choiceId) {
        this.choiceId = choiceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userchoices that = (Userchoices) o;
        return userChoiceId == that.userChoiceId && examDetailId == that.examDetailId && choiceId == that.choiceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userChoiceId, examDetailId, choiceId);
    }
}
