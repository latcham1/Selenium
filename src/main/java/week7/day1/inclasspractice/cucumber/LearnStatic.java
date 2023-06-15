package week7.day1.inclasspractice.cucumber;

public class LearnStatic {
	int empId;
	String empName;
	static String CompanyName;
	public void  setValues(int id, String name, String cName)
	{
		empId = id;
		empName=name;
		CompanyName=cName;
	}
	public void printvalue()
	{
		System.out.println(empId+" "+empName+" "+CompanyName);
	}
	public static void add()
	{
		System.out.println("i am a static");
	}
	public static void main(String[] args) {
		LearnStatic  ls = new LearnStatic();
		ls.setValues(100, "subraja", "TestLeaf");
		ls.printvalue();
		LearnStatic  ls1 = new LearnStatic();
		ls1.setValues(200, "Vidya", "RaghavHari");
		ls1.printvalue();
		ls.printvalue();
		add();
	}
}
