package com.sample.project;

import static org.assertj.core.api.Assertions.*;

import com.sample.project.domain.Person;
import com.sample.project.domain.PersonBuilder;
import com.sample.project.exception.InvalidAgeException;
import org.junit.Test;

public class PersonServiceTest {

    @Test
    public void shouldThrowWhenInvalidAgeIsPassed() {
        PersonService service = new PersonService();
        Person below18Years = PersonBuilder.builder().age(17).name("xyz").build();
        assertThatExceptionOfType(InvalidAgeException.class)
                .isThrownBy(() -> service.verify(below18Years))
                .withMessage("Person should be at least 18 years old");
    }
}
