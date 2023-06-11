package vceguide;

public class Q30CarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector gc1 =new GarbageCollector();
		GarbageCollector gc2 =new GarbageCollector();
		GarbageCollector gc3 =new GarbageCollector();
		gc1=gc3;
		gc3=gc2;
		gc2=null;
		System.out.println(gc1.toString());
		System.out.println(gc3.toString());
		System.out.println(“gc1 == gc3 : ” + gc1.equals(gc3));
		System.out.println(gc2.toString());
	}

}
