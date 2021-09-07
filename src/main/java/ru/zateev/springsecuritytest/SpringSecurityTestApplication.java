package ru.zateev.springsecuritytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ru.zateev.springsecuritytest.controller")
public class SpringSecurityTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityTestApplication.class, args);
    }

}
