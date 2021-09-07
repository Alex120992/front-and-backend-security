package ru.zateev.springsecuritytest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AccountController {

    @GetMapping("/account")
    public String sayWelcome(String input){
        return "Hello controlller";
    }
}
