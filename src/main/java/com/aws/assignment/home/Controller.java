package com.aws.assignment.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controller {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to AWS Deployment!";
    }

    @PostMapping("/submit")
    public String submit() {
        return "Data submitted successfully!";
    }
}
