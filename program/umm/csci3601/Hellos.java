package umm.csci3601;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

    public static final String WELCOME_LINE = "Hello, folks!";

    public static void main(String[] args) {
        String output = generateOutput();

        System.out.println(output);
    }

    public static String generateOutput() {
        StringBuilder builder = new StringBuilder();

        builder.append(WELCOME_LINE + "\n");
        builder.append(nicSaysHello());
        builder.append(kkSaysHello());
        builder.append(John_says_hello());
        builder.append(Abe_says_hello());

        return builder.toString();
    }

    private static String nicSaysHello() {
        return "Nic says 'Hello!'\n";
    }

    private static String kkSaysHello() {
        return "KK says 'Hello!'\n";
    }

    private static String John_says_hello() {
        return "John says 'Hello!'\n";
    }
    private static String Abe_says_hello() {
        return "Abe says 'Hello!'\n";
    }

}
