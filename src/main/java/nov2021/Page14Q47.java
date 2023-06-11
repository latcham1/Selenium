package nov2021;
public class Employee
{
	public int salary;
}
public class Manager extends Employee
{
	public int budget;
}
public class Director extends Manager
{
	public int stockOptions;
}

public class Page14Q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee=new Employee();
Manager manager = new Manager();
Director director = new Director();
employee.salary = 50_000;
director.salary = 80_000;
employee.budget = 200_000;   //C
manager.budget = 1_000_000;
manager.stockOption = 500;   //E
director.stockOptions = 1_000;

	}

}
