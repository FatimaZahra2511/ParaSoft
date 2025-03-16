package BusinessLogic;

import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;



public class CustomersList implements Serializable {
    ArrayList <Customer> CustomersCollection;
    public CustomersList(){
        CustomersCollection = new ArrayList <>();
    }
    public void AddCustomer (Customer c){
        CustomersCollection.add(c);
    }
    public void ModifyCustomer (Customer c1, Customer c2){
        int i= CustomersCollection.indexOf(c1);
        if (i != -1 ){
            CustomersCollection.remove(i);
            CustomersCollection.add(i, c2);
            System.out.println("The Customer's Identifiers are Successfully Modified :)");
        }
        System.out.println("This Customer Is Not In The Customers Collection (");
    }
    public Customer SearchCustomer (String name){
        for (Customer c : CustomersCollection) {
            if (c.getCustomerName(). equals(name))
                return c;
        }
        return null;
    }
    public String ViewCustomer (String name){
        Customer c = SearchCustomer(name);
        if(c!=null)
            return c.toString();
        else
            return "The Customer with name "+name+" is NOT Found in the Customers Collection";
    }
    public boolean DeleteCustomer (String name){
        Customer c = SearchCustomer(name);
        if(c!=null){
            CustomersCollection.remove(c);
            return true;
        }
        else
            return false;
    }
    public void displayCustomers() {
	if(CustomersCollection.isEmpty())
	    System.out.println("the list is empty!!");
	else {
	    Iterator<Customer> i=CustomersCollection.iterator();
	    while(i.hasNext())
		System.out.println(i.next());
	    }
        }
    public static void main(String[] args) {
        CustomersList collection= new CustomersList();
        Customer customer1 = new Customer("Foo", "Ifrane", "0666666", "GE1111");
        Customer customer2 = new Customer("toto", "Casablanca", "06678907", "JI67890");
        
        collection.AddCustomer(customer1);
        collection.AddCustomer(customer2);
        collection.displayCustomers();
    }
    
}