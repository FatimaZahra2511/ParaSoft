package BusinessLogic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SuppliersList {
    
    List<Supplier> SuppliersCollection;

    public SuppliersList() { 
        this.SuppliersCollection = new ArrayList<>();
    }  
    public void addSupplier(Supplier supplier1){
	SuppliersCollection.add(supplier1);
        
    }
    public void viewSuppliers() {
        if(SuppliersCollection.isEmpty())
            System.out.println("the list is empty!!");
        else {
	    Iterator<Supplier> i=SuppliersCollection.iterator();
            while(i.hasNext())
	       System.out.println(i.next());
	}
    }
    public static void main(String[] args) {
    
            SuppliersList supplierList = new SuppliersList();
            Supplier s1 = new Supplier("Rachid Moutawakil","05 Rue Wadi Adahab","0689632147","Rachid specializes in supplying healthcare products");
            Supplier s2 = new Supplier("Nadia El Hamidi","13 Rue Al Moujahidine","0645997721","Nadia specializes in supplying skincare and beauty products");
            Supplier s3 = new Supplier("Khalil Idrissi","19 Rue Riyadh Al Atlas","0632761498","Khalil specializes in supplying first aid products");
            Supplier s4 = new Supplier("Meriem Ben Abdellah","03 Rue Tajj Eddine","0661472258","Meriem specializes in supplying first aid products baby and maternity products");

            supplierList.addSupplier(s1);
            supplierList.addSupplier(s2);
            supplierList.addSupplier(s3);
            supplierList.addSupplier(s4);
            supplierList.viewSuppliers();

        }        
}