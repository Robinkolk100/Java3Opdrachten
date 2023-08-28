package Validation;

import User.User;

import java.util.Set;

public class Username implements ValidationRule {
    private Set<String> usedUsernames;

    public Username(Set<String> usedUsernames) {
        this.usedUsernames = usedUsernames;
    }

    @Override
    public boolean isValid(User user) {
        String username = user.getUserName();
        return !usedUsernames.contains(username);
    }
}
