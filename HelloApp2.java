public class HelloApp {

    public static void main(String[] args) {

        // Check if user provided a name as command-line argument
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } 
        else {
            // Default message if no argument is given
            System.out.println("Hello, World!");
        }

    }
}