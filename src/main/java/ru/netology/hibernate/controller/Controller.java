package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.service.Service;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getPersons(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}
