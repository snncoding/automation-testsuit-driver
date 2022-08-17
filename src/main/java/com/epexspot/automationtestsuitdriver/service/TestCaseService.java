package com.epexspot.automationtestsuitdriver.service;

import com.epexspot.automationtestsuitdriver.model.TestCase;
import com.epexspot.automationtestsuitdriver.model.TestSuite;
import com.epexspot.automationtestsuitdriver.repository.TestCaseRepository;
import com.epexspot.automationtestsuitdriver.repository.TestSuiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class TestCaseService {

    final private TestCaseRepository repository;

    public void add(TestCase t) {
        repository.save(t);
    }

    public TestCase find(Integer id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " not found"));
    }

    public List<TestCase> findAll() {
        return repository.findAll();
    }

    public void update(TestCase t) {
        /*TestSuite ts = find(testSuite.getId());
        ts.setDebug(testSuite.getDebug());
        ts.setEnvironment(testSuite.getEnvironment());
        ts.setExecuter(testSuite.getExecuter());
        ts.setTestSet(testSuite.getTestSet());
        ts.setFilePath(testSuite.getFilePath());
        ts.setTestCases(testSuite.getTestCases());*/
        repository.save(t);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }


}
