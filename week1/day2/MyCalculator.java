package week1.day2;

public class MyCalculator {
public static void main(String[] args) {
	Calculator calc = new Calculator();
	System.out.println("Multiplicaiton three number"+calc.Multiply(5, 2,5));
	System.out.println( "Division result"+calc.divide(10, 2));
	calc.display();
}
}
