package com.chenminhua.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/prepare")
    public String prepare() {
        try {
            Thread.sleep(new Random().nextInt(5) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ok";
    }

    @PostMapping("/commit")
    public void commit() {
    }

    @PostMapping("/rollback")
    public void rollback() {}
}


