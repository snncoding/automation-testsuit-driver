package com.epexspot.automationtestsuitdriver.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class TestCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String desc;

    private Integer testSuitId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "testCaseId", referencedColumnName = "id")
    private List<Step> steps;
}
