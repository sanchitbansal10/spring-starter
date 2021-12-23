package learn.java.CoronaTracker.models;

public class User {
    private String firstName;
    private String lastName;
    private String phone;
    private String userId;

    public User(String userId, String firstName, String lastName, String phone) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }
}
