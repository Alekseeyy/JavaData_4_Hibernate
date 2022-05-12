package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.service.Service;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonByCity(String city) {
        return service.getPersonByCity(city);
    }

    @GetMapping("/age-less-than")
    public List<Person> getPersonsByAgeLessThan(int age) {
        return service.getPersonsByAgeLessThan(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return service.getPersonByNameAndSurname(name, surname);
    }

    @PostMapping("/save")
    public Person save(Person person) {
        return service.save(person);
    }

    @GetMapping("/all-people")
    public List<Person> allPeople() {
        return service.allPeople();
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @PostMapping("/delete")
    public void deletePerson(Person person) {
        service.deletePerson(person);
    }

    @PostMapping("/delete-all-people")
    public void deleteAllPeople() {
        service.deleteAllPeople();
    }
}
