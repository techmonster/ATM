package holloway.nate.atm;

import java.util.ArrayList;

/**
 * Created by nathanielholloway on 9/17/16.
 * This is the Customer Manager class.
 * This class is responsible for communication with the customer class.
 * This class will create, store, and return customer objects.
 */

public class CustomerManager {
    private ArrayList<Customer> customers;
    private int customerIDCounter;
    private Customer newCustomer;


    CustomerManager(){
        customers = new ArrayList<Customer>();
    }


    public final Customer getCustomerById(int id){

        for (Customer c: customers) {
            if (id == c.getCustomerID())
                return c;
        }
        return null;
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }

    public Customer createNewCustomer( String firstName, String lastName, String pin){
        Customer newCustomer = Customer.createCustomer(firstName, lastName, pin);
        addCustomer(newCustomer);
        return newCustomer;
    }
}
