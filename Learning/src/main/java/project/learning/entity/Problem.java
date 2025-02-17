package project.learning.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Problem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "problemID", nullable = false)
    private int problemId;
    @Basic
    @Column(name = "problem", nullable = true, length = 255)
    private String problem;

    public int getProblemId() {
        return problemId;
    }

    public void setProblemId(int problemId) {
        this.problemId = problemId;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Problem problem1 = (Problem) o;
        return problemId == problem1.problemId && Objects.equals(problem, problem1.problem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(problemId, problem);
    }
}
