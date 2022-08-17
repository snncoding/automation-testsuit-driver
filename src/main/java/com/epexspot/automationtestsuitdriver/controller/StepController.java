package com.epexspot.automationtestsuitdriver.controller;

import com.epexspot.automationtestsuitdriver.model.Step;
import com.epexspot.automationtestsuitdriver.model.TestCase;
import com.epexspot.automationtestsuitdriver.service.StepService;
import com.epexspot.automationtestsuitdriver.service.TestCaseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/step")
@AllArgsConstructor
public class StepController {


    final private StepService service;

    @PostMapping
    public void add(@RequestBody Step t){
        service.add(t);
    }

    @GetMapping("/{id}")
    public Step find(@PathVariable Integer id){
        return service.find(id);
    }

    @GetMapping
    public List<Step> findAll(){
        return service.findAll();
    }

    @PutMapping
    public void update(@RequestBody Step t){
        service.update(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
