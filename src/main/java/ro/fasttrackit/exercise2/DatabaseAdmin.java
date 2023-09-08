package ro.fasttrackit.exercise2;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee{
    String dbTechnology;

    public DatabaseAdmin(String position, String firstName, String lastName, LocalDateTime birthday, String address, String dbTechnology) {
        super(position, firstName, lastName, birthday, address);
        this.dbTechnology = dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin: " + super.getAddress();
    }


}
