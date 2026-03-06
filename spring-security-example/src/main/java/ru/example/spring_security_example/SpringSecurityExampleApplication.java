package ru.example.spring_security_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringSecurityExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityExampleApplication.class, args);
    }
}
