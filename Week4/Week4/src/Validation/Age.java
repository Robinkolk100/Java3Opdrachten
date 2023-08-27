package Validation;

import User.User;

public class Age implements ValidationRule {
    private static final int MIN_AGE = 18;
    private int age;

    public Age(int age) {
        this.age = age;
    }

    @Override
    public boolean isValid(User user) {
        return age >= MIN_AGE;
    }
}
