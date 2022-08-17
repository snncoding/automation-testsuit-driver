package com.epexspot.automationtestsuitdriver.service;

import com.epexspot.automationtestsuitdriver.model.Payload;
import com.epexspot.automationtestsuitdriver.model.Step;
import com.epexspot.automationtestsuitdriver.repository.PayloadRepository;
import com.epexspot.automationtestsuitdriver.repository.StepRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class PayloadService {

    final private PayloadRepository repository;

    public void add(Payload t) {
        repository.save(t);
    }

    public Payload find(Integer id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " not found"));
    }

    public List<Payload> findAll() {
        return repository.findAll();
    }

    public void update(Payload t) {
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
