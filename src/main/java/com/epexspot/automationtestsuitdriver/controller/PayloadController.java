package com.epexspot.automationtestsuitdriver.controller;

import com.epexspot.automationtestsuitdriver.model.Payload;
import com.epexspot.automationtestsuitdriver.model.Step;
import com.epexspot.automationtestsuitdriver.service.PayloadService;
import com.epexspot.automationtestsuitdriver.service.StepService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payload")
@AllArgsConstructor
public class PayloadController {


    final private PayloadService service;

    @PostMapping
    public void add(@RequestBody Payload t){
        service.add(t);
    }

    @GetMapping("/{id}")
    public Payload find(@PathVariable Integer id){
        return service.find(id);
    }

    @GetMapping
    public List<Payload> findAll(){
        return service.findAll();
    }

    @PutMapping
    public void update(@RequestBody Payload t){
        service.update(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
