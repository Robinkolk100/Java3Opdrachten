package Validation;

import User.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email implements ValidationRule {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public boolean isValid(User user) {
        return isValidEmail(user.getEmail());
    }

    public boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
