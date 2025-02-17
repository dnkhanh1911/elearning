package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Choices {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ChoiceID", nullable = false)
    private int choiceId;
    @Basic
    @Column(name = "QuizID", nullable = false)
    private int quizId;
    @Basic
    @Column(name = "Description", nullable = false, length = 500)
    private String description;
    @Basic
    @Column(name = "IsTrue", nullable = false)
    private byte isTrue;

    public int getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(int choiceId) {
        this.choiceId = choiceId;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(byte isTrue) {
        this.isTrue = isTrue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Choices choices = (Choices) o;
        return choiceId == choices.choiceId && quizId == choices.quizId && isTrue == choices.isTrue && Objects.equals(description, choices.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(choiceId, quizId, description, isTrue);
    }
}
