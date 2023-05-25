package javaCertificaiton;

public class Employee {
String ename;
boolean contract;
double salary;
 Employee() {
	// TODO Auto-generated constructor stub
	this.ename = "Joe";
	this.contract = true;
	this.salary = 100;
 }
	public String toString(){
		return ename+":"+contract+":"+salary;
		
}
//	public String toString() {
//		return ename+":"+contract+":"+salary;
//	}
	public static void main(String[] args) {
		Employee emp = new Employee();
//		emp.ename="Jeo";
//		emp.contract=true;
//		emp.salary=100;
		System.out.println(emp);
	
}
}
