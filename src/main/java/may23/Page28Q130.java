package may23;

public class Page28Q130 {
	public static int stVar = 100;
	public int var=200;	
	public String toString()
	{
		return var+":"+stVar;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Page28Q130 t1=new Page28Q130();
		t1.var=300;
		System.out.println(t1);
		Page28Q130 t2=new Page28Q130();
		t2.stVar=300;
		System.out.println(t1);		
	}
}
