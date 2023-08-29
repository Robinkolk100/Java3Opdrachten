package Validation;

import User.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailTest {

    private Email emailValidator;

    @BeforeEach
    void setUp() {
        emailValidator = new Email("");
    }

    @Test
    void isValidEmail_ValidEmail_ReturnsTrue() {
        String validEmail = "test@example.com";
        assertTrue(emailValidator.isValidEmail(validEmail));
    }

    @Test
    void isValidEmail_InvalidEmail_ReturnsFalse() {
        String invalidEmail = "invalid.email";
        assertFalse(emailValidator.isValidEmail(invalidEmail));
    }

    @Test
    void isValid_ValidUserEmail_ReturnsTrue() {
        String validEmail = "user@example.com";
        User user = new User(29, validEmail, "Robin", "123@Aa");
        assertTrue(emailValidator.isValid(user));
    }

    @Test
    void isValid_InvalidUserEmail_ReturnsFalse() {
        String invalidEmail = "invalid.email";
        User user = new User(29, invalidEmail, "Robin", "123@Aa");
        assertFalse(emailValidator.isValid(user));
    }
}