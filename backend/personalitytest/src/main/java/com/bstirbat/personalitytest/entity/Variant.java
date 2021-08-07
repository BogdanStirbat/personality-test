package com.bstirbat.personalitytest.entity;

import javax.persistence.*;

@Entity
@Table(name = "variant")
public class Variant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "place_in_question")
    private Integer placeInQuestion;

    @Column(name = "body")
    private String body;

    @Column(name = "score")
    private Integer score;
}
