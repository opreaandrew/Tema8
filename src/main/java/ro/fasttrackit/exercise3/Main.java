package ro.fasttrackit.exercise3;
import ro.fasttrackit.exercise2.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Person jim = new Employee("salahor", "Jim", "Jones", LocalDateTime.of(1990,01,01,00,01), "Acasa la mama");
        Person jack = new Programmer("necalificat", "Jack", "Jones", LocalDateTime.of(1991,01,01,00,02), "La birt", "JavaScript");
        Person john = new DatabaseAdmin("CEO", "John", "Jones", LocalDateTime.of(1992,01,01,00,03), "Wakanda", "Marks SQL");

        dataReader[] google = {new dataReader(jim), new dataReader(jack), new dataReader(john)};
        for (dataReader data :google) {
            System.out.println(data.fullName());
            System.out.println(data.age());
            System.out.println("===============");
        }

    }
}
