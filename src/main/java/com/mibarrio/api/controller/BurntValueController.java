package com.mibarrio.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BurntValueController {

    @GetMapping("/burnt")
    public String getBurntValue() {
        return "Valor quemado";
    }
}