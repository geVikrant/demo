package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/shoutout/service")
public class SayHello {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> sampleOutput() {

        return new ResponseEntity<>(" Shouting out for world, by a spring-boot sample app ",
                        HttpStatus.OK);
    }
}
