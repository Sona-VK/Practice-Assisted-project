package assistedpracticeproject;

public class TryCatchBlock {

	public static void main(String[] args) {
		try {
		    // Code that may throw an exception
		    int result = 10 / 0; // This will throw an ArithmeticException
		} catch (ArithmeticException e) {
		    // Handle the exception
		    System.out.println("Division by zero is not allowed.");
		} catch (Exception e) {
		    // Handle other exceptions
		    System.out.println("An error occurred: " + e.getMessage());
		} finally {
		    // Optional: Code that will always be executed
		    System.out.println("This will always execute.");
		}

	}

}
