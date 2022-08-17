package com.epexspot.automationtestsuitdriver.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Parameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String name;
    @Column(name = "_value")
    private String value;
    private Integer payloadId;

}
