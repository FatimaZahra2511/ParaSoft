package BusinessLogic;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductsList {
	ArrayList<Product> ProductsCollection;

    public ProductsList() {
        this. ProductsCollection= new ArrayList<>();
    }

        
        public void addProduct(Product product)
	{
            ProductsCollection.add(product);   
	}
         public void displayProducts() {
		if(ProductsCollection.isEmpty())
			System.out.println("the list is empty!!");
		else {
		Iterator<Product> i=ProductsCollection.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		}  
        }   
         public static void main(String[] args) {
              ProductsList collection= new ProductsList();
              Product prod1= new Product("Ecran Solaire", "8966543", 45,"La Roche Posay","Skincare", 170.00, 200.00);
              Product prod2= new Product("Cream", "1256839", 20,"Vischy","Skincare", 150.00, 170.00);
              collection.addProduct(prod1);
              collection.addProduct(prod2);
              collection.displayProducts();

  }
}