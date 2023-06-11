package may23;

 class Product {
	double price;
}
public class Page43Test{
	public void updatePrice (Product Product, double price) 
	{
		price = price*2;
		Product.price = Product.price +price;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product prod = new Product();
		prod.price=500;
		double newPrice=100;
		
		
		Page43Test t=new Page43Test();
		t.updatePrice(prod, newPrice);
		System.out.println(prod.price+":"+newPrice);
	}

}
