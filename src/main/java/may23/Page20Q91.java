package may23;

public class Page20Q91
{	// TODO Auto-generated method stub
	int x, y;
	
	public Page20Q91(int x, int y)
	{
		initialize (x,  y);
	}
	public void initialize (int x, int y)
	{
		this.x=x*x;
		this.y=y*y; 
	}
	public static void main(String[] args) {
	
		int x=3,y=5;
		Page20Q91 obj = new Page20Q91 (x, y);
				System.out.println(obj.x+" "+obj.y);
	}

}
