package mycalculator_app;

public class MyCalculator {
	  public int add(int a, int b) {
	        return a + b;
	    }

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
        int sum = calc.add(3, 4);
        System.out.println("Sum = " + sum);


	}

}
