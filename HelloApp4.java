// Program: HelloApp.java
// UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
// This program greets multiple users passed as command-line arguments.
// If no arguments are provided, it displays "Hello, World!"

class HelloApp {

    public static void main(String[] args) {

        // Variable to store the final greeting message
        String greetingMessage;

        // Check if command-line arguments are provided
        if (args.length > 0) {

            // Create a StringBuilder object to build the greeting efficiently
            StringBuilder namesBuilder = new StringBuilder();

            // Loop through the args array to collect all names
            for (int i = 0; i < args.length; i++) {

                // Append the current name
                namesBuilder.append(args[i]);

                // Add comma and space if it is not the last name
                if (i < args.length - 1) {
                    namesBuilder.append(", ");
                }
            }

            // Build the final greeting message
            greetingMessage = "Hello, " + namesBuilder.toString() + "!";

        } else {

            // Default greeting if no names are provided
            greetingMessage = "Hello, World!";
        }

        // Display the greeting message
        System.out.println(greetingMessage);
    }
}