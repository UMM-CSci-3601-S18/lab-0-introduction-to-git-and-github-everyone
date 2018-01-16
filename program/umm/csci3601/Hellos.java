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
        builder.append(jubairSaysHello());
        builder.append(ahnafSaysHello());

        return builder.toString();
    }

    private static String jubairSaysHello() { return "Jubair Says 'Hello'\n";}

    private static String ahnafSaysHello() { return "Ahnaf Says 'Hello'\n";}
}
