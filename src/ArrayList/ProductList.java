package ArrayList;
import java.util.*;
import java.util.stream.Collectors;
class Product
{
	String name;
	int id;
	double price;
	public Product(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	
}	
public class ProductList {
	public static void main(String[] args) {
		Product p1 =new Product("orange",12,15000);
	    Product p2=new Product("apple",13,5000);
		Product p3=new Product("grapes",14,20000);
		List<Product>productlist=Arrays.asList(p1,p2,p3);
		List<Double>price=productlist.stream().filter(t->t.price>10000).map(t->t.price).collect(Collectors.toList());
	    System.out.println(price);

	}


}