package com.epexspot.automationtestsuitdriver.service;

import com.epexspot.automationtestsuitdriver.model.Parameter;
import com.epexspot.automationtestsuitdriver.model.Step;
import com.epexspot.automationtestsuitdriver.repository.ParameterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class ParameterService {

    final private ParameterRepository repository;

    public void add(Parameter t) {
        repository.save(t);
    }

    public Parameter find(Integer id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " not found"));
    }

    public List<Parameter> findAll() {
        return repository.findAll();
    }

    public void update(Parameter t) {
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
