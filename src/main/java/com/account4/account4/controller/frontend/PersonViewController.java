package com.account4.account4.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonViewController {

    @GetMapping("/persons/add")
    public String showAddPersonForm() {
        return "add-person";
    }
}