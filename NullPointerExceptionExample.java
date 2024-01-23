public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null; // Memberikan nilai null pada variabel str
            int length = str.length();  // Ini akan menimbulkan NullPointerException
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
            // Handle the exception here, such as providing a default value or logging the error
        }
    }
}

