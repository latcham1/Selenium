package may23;

 class Product {
	double price;
}
public class Page43Product{
	public void updatePrice (Product Product, double price) 
	{
		price = price*2;
		Product.price = Product.price +price;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prod = new Product();
		prod.price=200;
		double newPrice=100;
		
		
		Page43Product t=new Page43Product();
		t.updatePrice(prod, newPrice);
		System.out.println(prod.price+":"+newPrice);
	}

}
