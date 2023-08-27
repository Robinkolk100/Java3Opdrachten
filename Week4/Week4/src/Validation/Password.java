package Validation;

import User.User;

public class Password implements ValidationRule {
    private boolean allowSpaces;
    private boolean requireSpecialChars;
    private boolean requireNumbers;
    private boolean requireLowercase;
    private boolean requireUppercase;

    public Password(boolean allowSpaces, boolean requireSpecialChars,
                    boolean requireNumbers, boolean requireLowercase,
                    boolean requireUppercase) {
        this.allowSpaces = allowSpaces;
        this.requireSpecialChars = requireSpecialChars;
        this.requireNumbers = requireNumbers;
        this.requireLowercase = requireLowercase;
        this.requireUppercase = requireUppercase;
    }

    @Override
    public boolean isValid(User user) {
        String password = user.getPassword();

        if (!allowSpaces && password.contains(" ")) {
            return false;
        }

        if (requireSpecialChars && !password.matches(".*[!@#$%^&*()].*")) {
            return false;
        }

        if (requireNumbers && !password.matches(".*\\d.*")) {
            return false;
        }

        if (requireLowercase && !password.matches(".*[a-z].*")) {
            return false;
        }

        if (requireUppercase && !password.matches(".*[A-Z].*")) {
            return false;
        }

        return true;
    }

    public boolean allowsSpaces() {
        return allowSpaces;
    }

    public boolean requiresSpecialChars() {
        return requireSpecialChars;
    }

    public boolean requiresNumbers() {
        return requireNumbers;
    }

    public boolean requiresLowercase() {
        return requireLowercase;
    }

    public boolean requiresUppercase() {
        return requireUppercase;
    }
}
