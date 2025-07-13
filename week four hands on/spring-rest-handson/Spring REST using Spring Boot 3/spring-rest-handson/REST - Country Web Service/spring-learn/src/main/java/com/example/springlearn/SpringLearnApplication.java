package com.example.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to bootstrap the Spring Boot application.
 * It scans both com.example.springlearn and com.cognizant.springlearn packages.
 */
@SpringBootApplication(scanBasePackages = {
        "com.example.springlearn",
        "com.cognizant.springlearn.controller",
        "com.cognizant.springlearn.model"
})
public class SpringLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }
}

