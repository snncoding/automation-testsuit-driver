package com.epexspot.automationtestsuitdriver.controller;

import com.epexspot.automationtestsuitdriver.model.TestCase;
import com.epexspot.automationtestsuitdriver.model.TestSuite;
import com.epexspot.automationtestsuitdriver.service.TestCaseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/testcase")
@AllArgsConstructor
public class TestCaseController {


    final private TestCaseService service;

    @PostMapping
    public void add(@RequestBody TestCase t){
        service.add(t);
    }

    @GetMapping("/{id}")
    public TestCase find(@PathVariable Integer id){
        return service.find(id);
    }

    @GetMapping
    public List<TestCase> findAll(){
        return service.findAll();
    }

    @PutMapping
    public void update(@RequestBody TestCase t){
        service.update(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
