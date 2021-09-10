package ru.zateev.springsecuritytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans(
        {
                @ComponentScan("ru.zateev.springsecuritytest.controller"),
                @ComponentScan("ru.zateev.springsecuritytest.conf"),
                @ComponentScan("ru.zateev.springsecuritytest.service"),
                @ComponentScan("ru.zateev.springsecuritytest.repository")
        })
@EnableJpaRepositories("ru.zateev.springsecuritytest.repository")
@EntityScan("ru.zateev.springsecuritytest.model")
public class SpringSecurityTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityTestApplication.class, args);
    }

}
