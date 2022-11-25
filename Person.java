package GameStopClone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Person {
    String name;
    String address;
    GregorianCalendar dateOfBirth;

    // Never gets used actually, does it?
    public Person(){
        this("No name available!","No fixed abode!",new GregorianCalendar(1900,Calendar.JANUARY,1));
    }
    public Person(String name, String address, GregorianCalendar dateOfBirth){
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
    }

    // Get methods are Accessor methods.
    public String getName() {
        return name;
    }
    // Set Methods are mutator methods.
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        String build = "Person Name is: " + getName() +
                "\nPersons Address is: " + getAddress() +
                "\nDate of Birth: " +
                getDateOfBirth().get(Calendar.DATE) + "-" +
                getDateOfBirth().get(Calendar.MONTH) + "-" +
                getDateOfBirth().get(Calendar.YEAR);

        /* The code here was taken from Lab Sheet 10 exercise 1 and was written by
        *  John Brosnan. It was taken from Lecturer abstract class. */
        if(getDateOfBirth()!= null){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            Date dateOfBirth = getDateOfBirth().getTime();
            String dobAsString = dateFormat.format(dateOfBirth);
            build+=dobAsString;

            return build;
        }else
            return build + " Could not define a Date of Birth!";
    }
}
