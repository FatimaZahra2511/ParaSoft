package BusinessLogic;


import java.util.ArrayList;
import java.util.Iterator;


public class OrdersList {
        ArrayList<Order> OrdersCollection;

    public OrdersList() {
        this.OrdersCollection = new ArrayList<>();
    } 
    public void addOrder(Order o){
        OrdersCollection.add(o);
	}
    public void displayOrders() {
	if(OrdersCollection.isEmpty())
	    System.out.println("the list is empty!!");
	else {
	    Iterator<Order> i=OrdersCollection.iterator();
	    while(i.hasNext())
		System.out.println(i.next());
        }  
    }
    public static void main(String[] args) {
        Order or1=new Order(23,"10/12/2023","Nivea Soft","CONFIRMED",25.00,"CreditCard");
        Order or2=new Order(65,"11/12/2023","Sebium","CANCELLED",56.00,"Cash");
        OrdersList collection= new OrdersList();
        collection.addOrder(or1);
        collection.addOrder(or2);
        collection.displayOrders();
                   
     
         
     }

}