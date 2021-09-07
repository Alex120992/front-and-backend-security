package ru.zateev.springsecuritytest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/balance")
    public String sayWelcome(String input){
        return "Hello controlller";
    }
}
