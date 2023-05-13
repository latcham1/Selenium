package week3.day1;

public class Calculator {
	void add(int a, int b){
		System.out.println("add the two number" + (a+b));
	}
	void add(int a, int b, int c){
		System.out.println("add the three number" + (a+b+c));
	}
	void multiple(int a, double b){
		System.out.println("muply with double" + (a*b));
	}
	
	void multiple(int a, double b, float c){
		System.out.println("muply with double and float" + (a*b*c));
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(5, 7);
		calc.add(5, 5, 3);
		calc.multiple(5, 3536l);
		calc.multiple(343, 245234l, 3.36325432f);
	}
}
