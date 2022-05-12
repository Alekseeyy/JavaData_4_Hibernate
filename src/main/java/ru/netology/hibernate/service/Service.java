package ru.netology.hibernate.service;

import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private final PersonRepository repository;

    public Service(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Person> getPersonsByAgeLessThan(int age) {
        return repository.findByIdAgeLessThanOrderByIdAge(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return repository.findByIdNameAndIdSurname(name, surname);
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public List<Person> allPeople() {
        return repository.findAll();
    }

    public long count() {
        return repository.count();
    }

    public void deletePerson(Person person) {
        repository.delete(person);
    }

    public void deleteAllPeople() {
        repository.deleteAll();
    }
}
