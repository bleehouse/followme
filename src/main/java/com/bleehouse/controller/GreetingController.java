package com.bleehouse.controller;

import com.bleehouse.repository.Greeting;
import com.bleehouse.service.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    public final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public Greeting greeting(){
        return greetingService.getGreeting();
    }

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public ResponseEntity<Greeting> hello(){
        return new ResponseEntity<>(greetingService.getGreeting(), HttpStatus.OK);
    }
}

