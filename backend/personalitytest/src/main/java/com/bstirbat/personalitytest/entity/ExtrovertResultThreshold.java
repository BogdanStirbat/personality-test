package com.bstirbat.personalitytest.entity;

import javax.persistence.*;

@Entity
@Table(name = "extrovert_result_threshold")
public class ExtrovertResultThreshold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "threshold")
    private Integer threshold;
}
