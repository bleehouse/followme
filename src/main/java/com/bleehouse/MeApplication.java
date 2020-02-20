package com.bleehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(MeApplication.class);
        app.addListeners(new SampleListener());
        app.run(args);
    }
}
