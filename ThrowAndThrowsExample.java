package assistedpracticeproject;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ThrowAndThrowsExample {
    public static void main(String[] args) {
        try {
            throwExample();
        } catch (CustomException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try {
            throwsExample();
        } catch (CustomException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void throwExample() throws CustomException {
        System.out.println("Inside throwExample");
        throw new CustomException("This is a custom exception using 'throw'");
    }

    public static void throwsExample() throws CustomException {
        System.out.println("Inside throwsExample");
        throw new CustomException("This is a custom exception using 'throws'");
    }
}

