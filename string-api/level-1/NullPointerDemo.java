public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;   // initialized to null

        // This line will generate NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;   // initialized to null

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled.");
        }
    }

    public static void main(String[] args) {

        // Step b: Call method to generate exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException().");
        }

        // Refactored code: call method that handles exception
        System.out.println("\nHandling NullPointerException safely:");
        handleException();
    }
}
