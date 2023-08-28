package User;

public class User {

    private int age;
    private String email;
    private String userName;
    private String password;

    public User(int age, String email, String userName, String password) {

        this.age = age;
        this.email = email;
        this.userName = userName;
        this.password = password;

    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
