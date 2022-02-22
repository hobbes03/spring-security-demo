package com.atc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="userId", required = false, defaultValue = "World") String userId, Model model) {
        model.addAttribute("name", userId);
        return "greeting";
    }
}
