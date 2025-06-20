package com.example.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeploymentController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
