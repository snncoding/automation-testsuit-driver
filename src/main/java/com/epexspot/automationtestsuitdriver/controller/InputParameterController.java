package com.epexspot.automationtestsuitdriver.controller;

import com.epexspot.automationtestsuitdriver.model.InputParameter;
import com.epexspot.automationtestsuitdriver.model.Step;
import com.epexspot.automationtestsuitdriver.service.InputParameterService;
import com.epexspot.automationtestsuitdriver.service.StepService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inputparameter")
@AllArgsConstructor
public class InputParameterController {


    final private InputParameterService service;

    @PostMapping
    public void add(@RequestBody InputParameter t){
        service.add(t);
    }

    @GetMapping("/{id}")
    public InputParameter find(@PathVariable Integer id){
        return service.find(id);
    }

    @GetMapping
    public List<InputParameter> findAll(){
        return service.findAll();
    }

    @PutMapping
    public void update(@RequestBody InputParameter t){
        service.update(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
