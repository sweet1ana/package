package dto;

import java.util.Objects;

/**
 * Created by svetlana on 22.04.2015.
 */
public class User {

    private long userID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public User(String firstName, String lastName, String email, String password, long userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        User other = (User) otherObject;
        return userID == other.userID && Objects.equals(firstName, other.firstName) &&
                Objects.equals(lastName, other.lastName) && Objects.equals(email, other.email) &&
                Objects.equals(password, other.password);
    }

    @Override
    public int hashCode() {
        return 7 * new Long(userID).hashCode()
                + 11 * firstName.hashCode()
                + 13 * lastName.hashCode()
                + 17 * email.hashCode()
                + 19 * password.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + "[userID = " + userID + ", firstName = " + firstName +
                ", lastName = " + lastName + ", email = " + email + ", password = " + password + "]";
    }
}
