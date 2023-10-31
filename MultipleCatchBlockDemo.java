package assistedpracticeproject;

public class MultipleCatchBlockDemo {

	    public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3};
	            int result = numbers[5] / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException: " + e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Generic Exception: " + e.getMessage());
	        }
	    }



	}

