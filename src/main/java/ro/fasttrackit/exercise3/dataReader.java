package ro.fasttrackit.exercise3;
import ro.fasttrackit.exercise2.*;

import java.time.Duration;
import java.time.LocalDateTime;

public class dataReader{
    Person person;
    public dataReader(Person person){
        this.person = person;
    }
   public String fullName(){
       return "Full name: " + this.person.getFirstName() + " " + this.person.getLastName();
   }

   public String age(){
        Duration age = Duration.between(this.person.getBirthday(), LocalDateTime.now());
        // I know it's not precise, but it's pretty :)
        return "Age: " + age.toDays()/365 + "years, " + (age.toDays()%365)/31 + "months, " + (age.toDays()%365)%12 + "days.";
   }
}
