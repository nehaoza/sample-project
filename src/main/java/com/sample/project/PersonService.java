package com.sample.project;

import com.sample.project.exception.InvalidAgeException;

public class PersonService {

    public void verifyAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Person should be at least 18 years old");
        }
    }
}
