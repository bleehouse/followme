package com.bleehouse.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class MeApplication {

    public static void main(String[] args) {
//        SpringApplication.run(MeApplication.class, args);
        SpringApplication app = new SpringApplication(MeApplication.class);
        app.addListeners(new SampleListener());
        app.run(args);
    }
}
