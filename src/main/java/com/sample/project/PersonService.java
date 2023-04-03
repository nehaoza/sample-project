package com.sample.project;

import com.sample.project.domain.Person;
import com.sample.project.exception.InvalidAgeException;

public class PersonService {

    public void verify(Person person) throws InvalidAgeException {
        if (person.age() < 18) {
            throw new InvalidAgeException("Person should be at least 18 years old");
        }
    }
}
