package com.bleehouse.service.impl;

import com.bleehouse.repository.Greeting;
import com.bleehouse.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private Greeting greeting = new Greeting(10, "This is test");

    @Override
    public Greeting getGreeting() {
        return greeting;
    }
}
