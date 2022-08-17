package com.epexspot.automationtestsuitdriver.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class InputParameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    @Column(name = "_value")
    private String value;

    private Integer stepId;
    @OneToOne
    @JoinColumn(name = "payloadId", referencedColumnName = "id")
    private Payload payload;
}