package may23;

public class Page09Q30_Product {
int id;
String name;
public Page09Q30_Product (int id, String name) {
	this.id=id;
	this.name=name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Page09Q30_Product p1= new Page09Q30_Product(101, "pen");
		Page09Q30_Product p2= new Page09Q30_Product(101, "pen");
		Page09Q30_Product p3=p1;
		boolean ans1=p1==p2;
		System.out.println(p1+":"+p2);
		boolean ans2=p1.name.equals(p2.name);
		System.out.println(p1.name+":"+p2.name);
		System.out.println(ans1+":"+ans2);

}
}
