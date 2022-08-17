package com.epexspot.automationtestsuitdriver.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String functionName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "stepId", referencedColumnName = "id")
    private List<InputParameter> inputParameters = new java.util.ArrayList<>();

    private String testCaseId;
}
