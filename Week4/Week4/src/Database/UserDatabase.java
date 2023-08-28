package Database;

import User.User;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private List<User> userList;

    public UserDatabase() {
        this.userList = new ArrayList<>();
    }

    public boolean addUser(User user) {
        if (!userExists(user)) {
            userList.add(user);
            return true;
        } else {
            return false;
        }
    }

    private boolean userExists(User user) {
        for (User existingUser : userList) {
            if (existingUser.getUserName().equals(user.getUserName())) {
                return true;
            }
        }
        return false;
    }
}
