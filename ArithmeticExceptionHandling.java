package Exception;
public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = divideByZero();  // Example: Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            // Handle the exception here, such as providing a default value or logging the error
        }
    }

    public static int divideByZero() {
        // This method simulates a division by zero scenario
        return 10 / 0;
    }
}
