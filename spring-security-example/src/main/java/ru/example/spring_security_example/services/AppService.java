package ru.example.spring_security_example.services;

import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import ru.example.spring_security_example.models.Application;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class AppService {

    private List<Application> applications;
    @PostConstruct
    public void loaddAppInDB(){
        Faker faker = new Faker();
        applications = IntStream.rangeClosed(1,100)
                .mapToObj(i-> Application.builder()
                .id(i)
                .name(faker.app().name())
                .author(faker.app().author())
                .version(faker.app().version())
                .build())
        .toList();
    }

    public List<Application> allAplications() {
        return applications;
    }
    public Application applicationById(int id) {
        return  applications.stream()
                .filter(app -> app.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
