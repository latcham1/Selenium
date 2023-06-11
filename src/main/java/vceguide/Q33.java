package vceguide;
interface Exportable
{
	void export();
}

class Tool implements Exportable
{
	public  void export() // replace with public will work
	{ }
}

public class Q33 extends Tool implements Exportable 
{
	public void export()
	{
	}

	public static void main(String[] args) 
	{
		Tool aToll = new Q33();
		Tool btool = new Tool();
		callExport(aToll);
		callExport(btool);
	}

	public static void callExport(Exportable ex) 
	{
		ex.export();
	}
}

