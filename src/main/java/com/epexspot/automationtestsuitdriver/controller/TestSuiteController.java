package com.epexspot.automationtestsuitdriver.controller;

import com.epexspot.automationtestsuitdriver.model.TestSuite;
import com.epexspot.automationtestsuitdriver.service.TestSuiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/testsuite")
@AllArgsConstructor
public class TestSuiteController {


    final private TestSuiteService service;

    @PostMapping
    public void add(@RequestBody TestSuite testSuite){
        service.add(testSuite);
    }

    @GetMapping("/{id}")
    public TestSuite find(@PathVariable Integer id){
        return service.find(id);
    }

    @GetMapping
    public List<TestSuite> findAll(){
        return service.findAll();
    }

    @PutMapping
    public void update(@RequestBody TestSuite testSuite){
        service.update(testSuite);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
