package assistedpracticeproject;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		  Scanner scanner = new Scanner(System.in);
	        String userInput;

	        do {
	            System.out.print("Enter a command (type 'exit' to quit): ");
	            userInput = scanner.nextLine();

	            System.out.println("You entered: " + userInput);
	        } while (!userInput.equals("exit"));

	        System.out.println("Program exited.");
	        scanner.close();
	    }
	


	}


