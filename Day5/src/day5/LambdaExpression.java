package day5;

	interface LambdaExpressions1 {
	    double add(double a, double b);
	}

	public class LambdaExpression {
	    public static void main(String[] args) {
	        LambdaExpressions1 addition = (a, b) -> {
	            System.out.println("Addition");
	            double result = a + b;
	            System.out.println("result: " + result);
	            return result;
	        };

	        double a = 1000.0, b = 2000.0;
	        addition.add(a, b);
	    }
	}
