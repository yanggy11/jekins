package com.derrick.jekins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JekinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JekinsApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String home() {
        return "home page";
    }
}
