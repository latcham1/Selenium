package fromRamDump;

public class Employee {
	String ename;
	boolean contract;
	double salary;
	Employee() {
		// TODO Auto-generated constructor stub    //n1
		//		this.ename=new String ("Jeo");
		//		this.contract = new Boolean(true);
		//		this.salary = new Double(100);

	}
	public String toString(){
		return ename+":"+contract+":"+salary;

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		//				e.ename="Jeo";               //n2
		//				e.contract=true;
		//				e.salary=100;
		System.out.println(e);

	}
}
