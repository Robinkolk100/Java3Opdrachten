package Validation;

import User.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AgeTest {

    private Age age;

    @BeforeEach
    void setUp() {
        age = new Age(0);
    }

    @Test
    void isValid_ValidUSerAge_ReturnsTrue() {
        int validAge = 26;
        User user = new User(validAge, "RobinK@email.com", "Robin", "123@Aa");
        assertTrue(age.isValid(user));
    }

    @Test
    void isValid_InValidUserAge_ReturnsFalse() {
        int validAge = 10;
        User user = new User(validAge, "RobinK@email.com", "Robin", "123@Aa");
        assertFalse(age.isValid(user));
    }

    @Test
    void isValid_InValidUserAgeOnMinAge_ReturnsFalse() {
        int validAge = 10;
        User user = new User(validAge, "RobinK@email.com", "Robin", "123@Aa");
        assertFalse(age.isValid(user));
    }
}