package com.bstirbat.personalitytest.entity;

import javax.persistence.*;

@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "quiz_id")
    private String quizId;

    @Column(name = "current_question")
    private Long currentQuestion;

    @Column(name = "current_score")
    private Integer currentScore;

    @Column(name = "completed")
    private Boolean completed;

    @Column(name = "result")
    private String result;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public Long getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(Long currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public Integer getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(Integer currentScore) {
        this.currentScore = currentScore;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
