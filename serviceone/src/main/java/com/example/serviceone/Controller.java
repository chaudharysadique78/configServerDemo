package com.example.serviceone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping()
    public String message() {
        return message+" "+location;
    }

}