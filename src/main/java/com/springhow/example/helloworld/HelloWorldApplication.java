package com.springhow.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorldApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    // Fancy JSON response
    @GetMapping("/")
    public Map<String, Object> helloWorld() {
        Map<String, Object> response = new HashMap<>();
        response.put("title", "🚀 Welcome to Satyajit’s API");
        response.put("message", "Hello From Satyajit! 🎉");
        response.put("version", "1.0");
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }
}

