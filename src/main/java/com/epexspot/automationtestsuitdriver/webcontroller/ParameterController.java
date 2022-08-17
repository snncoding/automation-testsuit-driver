package com.epexspot.automationtestsuitdriver.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParameterController {
    @GetMapping("/parameter")
    public String parameter() {
        return "parameter";
    }
}
