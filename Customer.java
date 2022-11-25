package GameStopClone;

// Daniel Jameson T00158237
/* This class file exists to handle the properties of the customers,
*  including setting ID numbers and providing purchase information.*/

import java.util.GregorianCalendar;

public class Customer extends Person {
    int customerID = 0;
    int purchases;

    public Customer(String name, String address, GregorianCalendar dateOfBirth,int purchases) {
        super(name, address, dateOfBirth);
        setCustomerID(customerID);
        setPurchases(purchases);
    }

    public int getCustomerID() {
        customerID++;
        if(customerID > 0 && customerID < Integer.MAX_VALUE)
            return customerID;
        else
            return 0;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getPurchases() {
        return purchases;
    }
    public void setPurchases(int purchases) {
        this.purchases = purchases;
    }

    @Override
    public String toString() {
        return "Customer Id Number: " + getCustomerID() +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nDate of Birth: " + getDateOfBirth();
    }
}
