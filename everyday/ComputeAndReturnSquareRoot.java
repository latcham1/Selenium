package everyday;

public class ComputeAndReturnSquareRoot {
public static void main(String[] args) {
	double t;
	  double number =146;
    double squareroot = number / 2;
  
    do {
        t = squareroot;
        squareroot = (t + (number / t)) / 2;
    } while ((t - squareroot) != 0);
    int value = (int)squareroot;
    System.out.println(value);
    
}
}
