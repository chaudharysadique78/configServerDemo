package com.example.serviceone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service1")
public class Controller {

    @Value("${message}")
    private String message;

    @Value("${location}")
    private String location;

    @Value("${topic}")
    private String topic;

    @GetMapping()
    public String message() {
        return message+" "+location+" "+ topic;
    }



}