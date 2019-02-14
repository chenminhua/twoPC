package com.chenminhua.coordinator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CoordinatorApp {

    public static void main(String[] args) {
        SpringApplication.run(CoordinatorApp.class);
    }

}


@RestController
public class MainControler {

    @GetMapping("/test")
    public String test() {
        // todo prepare

//        try {
//            commit
//        } catch() {
//            rollback
//        }

    }

}