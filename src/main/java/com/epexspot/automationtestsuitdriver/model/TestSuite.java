package com.epexspot.automationtestsuitdriver.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class TestSuite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String executer;
    private String testSet;
    private String environment;
    private String debug;
    private String resultDirectory;
    private String filePath;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "testSuitId", referencedColumnName = "id")
    private List<TestCase> testCases;

}
