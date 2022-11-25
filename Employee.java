package GameStopClone;

// Daniel Jameson T00158237
/* This class contains unique attributes and methods for the employees of GameStopClone */

import java.util.GregorianCalendar;

public class Employee extends Person {
    int employeeID;
    String ppsNumber;

    public Employee(String name, String address, String ppsNumber, GregorianCalendar dateOfBirth){
        super(name,address,dateOfBirth);
        setEmployeeID(employeeID);
        setPPSNumber(ppsNumber);
    }

    public int getEmployeeID() {
        if(employeeID > 0 && employeeID < Integer.MAX_VALUE)
            return employeeID;
        else
            return 0;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPPSNumber() {
        return ppsNumber;
    }
    public void setPPSNumber(String ppsNumber) {
        this.ppsNumber = ppsNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee ID: " +
                getEmployeeID() + "\nPPS Number: " + getPPSNumber();
    }
}
