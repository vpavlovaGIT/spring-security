package ru.example.spring_security_example.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.spring_security_example.models.Application;
import ru.example.spring_security_example.services.AppService;

import java.util.List;

@RestController
@RequestMapping("api/v1/apps")
@AllArgsConstructor
public class AppController {

    private AppService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome, User!";
    }

    @GetMapping("/all-app")
    public List<Application> allApplications() {
        return service.allAplications();
    }

    @GetMapping("/{id}")
    public  Application applicationByID (@PathVariable int id) {
        return service.applicationById(id);
    }
}
