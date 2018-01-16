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
        builder.append(auroraSaysHello());
        builder.append(kaiSaysHello());
        builder.append(kkSaysHello());
        builder.append(jacobSaysHello());
        builder.append(mattSaysHello());
        builder.append(nicSaysHello());

        return builder.toString();
    }

    private static String jacobSaysHello() { return "Jacob says 'Hello!'\n";}

    private static String mattSaysHello() { return "Matt says 'Hello!'\n";}

    private static String nicSaysHello() {
        return "Nic says 'Hello!'\n";
    }

    private static String kkSaysHello() {
        return "KK says 'Hello!'\n";
    }

    private static String auroraSaysHello() {
        return "Aurora says 'Hello!'\n";
    }

    private static String kaiSaysHello() {
        return "Kai says 'Hello!'\n";
    }



}
