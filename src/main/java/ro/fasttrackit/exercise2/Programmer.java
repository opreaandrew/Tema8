package ro.fasttrackit.exercise2;

import java.time.LocalDateTime;

public class Programmer extends Employee{
    String language;

    public Programmer(String position, String firstName, String lastName, LocalDateTime birthday, String address, String language) {
        super(position, firstName, lastName, birthday, address);
        this.language = language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
