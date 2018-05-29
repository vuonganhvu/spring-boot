package com.higgsup.spring.controller;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anhvu on 29-May-18.
 */
@RestController
@RequestMapping("/api")
public class HelloRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello");
    }
}
