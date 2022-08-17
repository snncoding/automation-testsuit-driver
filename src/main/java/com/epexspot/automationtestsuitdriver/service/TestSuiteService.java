package com.epexspot.automationtestsuitdriver.service;

import com.epexspot.automationtestsuitdriver.model.TestSuite;
import com.epexspot.automationtestsuitdriver.repository.TestSuiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class TestSuiteService {

    final private TestSuiteRepository repository;

    public void add(TestSuite testSuite){
        repository.save(testSuite);
    }

    public TestSuite find(Integer id){
        return repository.findById(id).orElseThrow(()-> new EntityNotFoundException(id + " not found"));
    }

    public List<TestSuite> findAll(){
        return repository.findAll();
    }

    public void update(TestSuite testSuite){
        /*TestSuite ts = find(testSuite.getId());
        ts.setDebug(testSuite.getDebug());
        ts.setEnvironment(testSuite.getEnvironment());
        ts.setExecuter(testSuite.getExecuter());
        ts.setTestSet(testSuite.getTestSet());
        ts.setFilePath(testSuite.getFilePath());
        ts.setTestCases(testSuite.getTestCases());*/
        repository.save(testSuite);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }



}
