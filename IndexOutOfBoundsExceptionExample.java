package Exception;
public class IndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int value = array[5];  // Example: Attempting to access an index that is out of bounds
            System.out.println("Value: " + value);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
            // Handle the exception here, such as providing a default value or logging the error
        }
    }
}


