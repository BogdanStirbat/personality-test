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
}
