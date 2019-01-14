package com.abnamro.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class NameController {

    @GetMapping("/name")
    public String getName(){
        return "Stoffel Schoenmakers AT HOME";
    }
}
