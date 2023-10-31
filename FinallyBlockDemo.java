package assistedpracticeproject;


	import java.io.FileWriter;
	import java.io.IOException;
	
	
	public class FinallyBlockDemo {
	    public static void main(String[] args) {
	        FileWriter file = null;
	        try {
	            file = new FileWriter("example.txt");
	            file.write("Hello, World!");
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        } finally {
	            try {
	                if (file != null) {
	                    file.close(); // This code will always be executed
	                }
	            } catch (IOException e) {
	                System.out.println("Error while closing the file: " + e.getMessage());
	            }
	        
	        }
	    }
	}

	


