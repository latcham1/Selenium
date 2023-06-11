package may23;

public class Page11Q40_Rectangle 
{
	private double length;
	private double height;
	private double area;
	public void setLength(double length) {
		this.length = length;

	}
	public void setHeight(double height) {
		this.height = height;
		setArea();
	}
	private void setArea() {
		area = length*height;
	}
	public static void main(String args[]) {
		Page11Q40_Rectangle rectangle = new Page11Q40_Rectangle();
		
		rectangle.setLength(200);
		rectangle.setHeight(20);
		System.out.println(rectangle.area);
	}
}



