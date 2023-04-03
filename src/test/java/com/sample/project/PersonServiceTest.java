package com.sample.project;

import com.sample.project.exception.InvalidAgeException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PersonServiceTest {

    @Test
    public void shouldThrowWhenInvalidAgeIsPassed() {
        PersonService service = new PersonService();
        assertThatExceptionOfType(InvalidAgeException.class)
            .isThrownBy(() -> service.verifyAge(2))
            .withMessage("Person should be at least 18 years old");
    }
}
