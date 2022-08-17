package com.epexspot.automationtestsuitdriver.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Payload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String typeName;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "payloadId", referencedColumnName = "id")
    private List<Parameter> payloadParameters;

    private Integer inputParameterId;

}