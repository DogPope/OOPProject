package GameStopClone;

// Daniel Jameson T00158237
/* This is a small Driver class for GameStopClone, just built to test class functionality. */

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AmazonClone{
    private boolean toTheMoon = true;

    public static void main(String[] args) {
        Game ResidentEvil = new Game(1,"Resident Evil","Horror","Ca$hcom",-12f,"This one?");
        Game metalGearSolid = new Game(2,"Metal Gear Solid","Action","FromSoft",12.5f,"Romance");
        Game eldenRing = new Game(3,"Elden Ring","Action","FromSoft",12.5f,"Romance");
        Game Doom = new Game(2,"Doom","Action","ID Software",12.50f,"Proper12");

        Customer jeff = new Customer("Billy","Tralee",new GregorianCalendar(1985,5,10),1);
        Customer willie = new Customer("Richard","Gortatlea",new GregorianCalendar(1990, Calendar.MONTH,23),23);

        Employee boss = new Employee("Bruce Springsteen","Wilton","T12",new GregorianCalendar(1980,7,1));
        Employee pat = new Employee("Pat","Timbucktoo","T45",new GregorianCalendar(1990,8,9));
        Employee employee = new Employee("Walter H White","Tralee","P34 12TH",new GregorianCalendar(1970,11,23));
        Employee owner = new Employee("Elon Musk","Wilton","T54 84KJ",new GregorianCalendar(1901,6,12));

        //Customer jeff = new Customer("Billy","Tralee",new GregorianCalendar(1985,5,10),1);
        //Customer willie = new Customer("Richard","Gortatlea",new GregorianCalendar(1990,11,23),23);
        Customer jesse = new Customer("Jesse Pinkman","Albuqurque",new GregorianCalendar(1990,5,12),120);
        ///ArrayList<Customer> customers = new ArrayList<>(Arrays.asList(jeff,willie,jesse));
        /*name = JOptionPane.showInputDialog(null,"Please enter the employees name: ","Name entry",JOptionPane.INFORMATION_MESSAGE);
        address = JOptionPane.showInputDialog(null,"Please enter the employees address: ","Address entry",JOptionPane.INFORMATION_MESSAGE);
        ppsNumber = JOptionPane.showInputDialog(null,"Please enter the employees PPS Number: ","PPS entry",JOptionPane.INFORMATION_MESSAGE);
        dateOfBirth = JOptionPane.showInputDialog(null,"Please enter the employees date of birth: (DD-MM-YYYY)","Date of Birth entry",JOptionPane.INFORMATION_MESSAGE);
        Employee = new Employee(name,address,ppsNumber,dateOfBirth);
        Employee.add(Employee);*/

        JOptionPane.showMessageDialog(null,"Boss Details" + boss,"Employee1",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
