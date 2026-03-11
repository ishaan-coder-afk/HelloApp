public class HelloApp {

    public static void main(String[] args) {

        // Use ternary operator to assign name
        String name = (args.length > 0) ? args[0] : "World";

        // Display greeting
        System.out.println("Hello, " + name + "!");
    }
}