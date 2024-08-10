import java.lang.*;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String phoneNumber;
    private String gender;

    public User() {}

    public User(String firstName, String lastName, String username, String email, String phoneNumber, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
	
	/*public User(String firstName, String lastName, String username, String email, String phoneNumber, String gender) {
    this.firstName = firstName;
    this.lastName = lastName;
    //this.age = age;
    this.username = username;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.gender = gender;
    }*/


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void showUserInfo() {
        System.out.println("First Name   : " + firstName);
        System.out.println("Last Name    : " + lastName);
        System.out.println("Username     : " + username);
        System.out.println("Email        : " + email);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Gender       : " + gender);
    }

    public String getUserInfoAsString() {
        return  "First Name    : " + firstName + "\n" +
                "Last Name     : " + lastName + "\n" +
                "Username      : " + username + "\n" +
                "Email         : " + email + "\n" +
                "Phone Number  : " + phoneNumber + "\n" +
                "Gender        : " + gender + "\n";
    }
}
