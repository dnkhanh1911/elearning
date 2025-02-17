package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Quiz {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "QuizID", nullable = false)
    private int quizId;
    @Basic
    @Column(name = "QuizContent", nullable = false, length = 1500)
    private String quizContent;
    @Basic
    @Column(name = "ExamID", nullable = false)
    private int examId;

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getQuizContent() {
        return quizContent;
    }

    public void setQuizContent(String quizContent) {
        this.quizContent = quizContent;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return quizId == quiz.quizId && examId == quiz.examId && Objects.equals(quizContent, quiz.quizContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quizId, quizContent, examId);
    }
}
