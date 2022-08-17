package com.epexspot.automationtestsuitdriver.service;

import com.epexspot.automationtestsuitdriver.model.InputParameter;
import com.epexspot.automationtestsuitdriver.model.Step;
import com.epexspot.automationtestsuitdriver.repository.InputParameterRepository;
import com.epexspot.automationtestsuitdriver.repository.StepRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class InputParameterService {

    final private InputParameterRepository repository;

    public void add(InputParameter t) {
        repository.save(t);
    }

    public InputParameter find(Integer id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " not found"));
    }

    public List<InputParameter> findAll() {
        return repository.findAll();
    }

    public void update(InputParameter t) {
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
