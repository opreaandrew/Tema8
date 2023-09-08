package ro.fasttrackit.exercise2;

import java.time.LocalDateTime;

public class Employee implements Person {
    LocalDateTime dateOfEmployment;
    String position;
    String firstName;
    String lastName;
    LocalDateTime birthday;
    String address;

    public Employee(String position, String firstName, String lastName, LocalDateTime birthday, String address) {
        this.dateOfEmployment = LocalDateTime.now();
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDateTime getBirthday() {
        return this.birthday;
    }

    public String getAddress() {
        return this.address;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }
}
