package com.epexspot.automationtestsuitdriver.controller;

import com.epexspot.automationtestsuitdriver.model.Parameter;
import com.epexspot.automationtestsuitdriver.model.Step;
import com.epexspot.automationtestsuitdriver.service.ParameterService;
import com.epexspot.automationtestsuitdriver.service.StepService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parameter")
@AllArgsConstructor
public class ParameterController {


    final private ParameterService service;

    @PostMapping
    public void add(@RequestBody Parameter t){
        service.add(t);
    }

    @GetMapping("/{id}")
    public Parameter find(@PathVariable Integer id){
        return service.find(id);
    }

    @GetMapping
    public List<Parameter> findAll(){
        return service.findAll();
    }

    @PutMapping
    public void update(@RequestBody Parameter t){
        service.update(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
