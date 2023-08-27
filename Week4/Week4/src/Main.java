import Database.UserDatabase;
import User.User;
import Validation.*;

public class Main {

    public static void main(String[] args) {
        UserDatabase userDatabase = new UserDatabase();

        User user1 = new User(19, "Henk@mail.com", "BobDeBouwer", "w12Aw@!w");
        User user2 = new User(20, "BOB@mail.com", "BobDeBouwer", "1234@e@qwQ");

        Age ageValidator = new Age(user1.getAge());
        Email emailValidator = new Email(user1.getEmail());
        Password passwordValidator = new Password(true,true,true,true,true);

        if (ageValidator.isValid(user1) && emailValidator.isValid(user1) &&
                passwordValidator.isValid(user1)) {
            if (userDatabase.addUser(user1) == true){
            System.out.println("User 1 added successfully.");
            }
            else { System.out.println("User 2 username already exist");}
        } else {
            System.out.println("User 1 validation failed.");
        }

        if (ageValidator.isValid(user2) && emailValidator.isValid(user2) &&
                passwordValidator.isValid(user2)) {
            if(userDatabase.addUser(user2) == true ){
            System.out.println("User 2 added successfully.");
            }
            else { System.out.println("User 2 username already exist");}
        } else {
            System.out.println("User 2 validation failed.");
        }
    }
}
