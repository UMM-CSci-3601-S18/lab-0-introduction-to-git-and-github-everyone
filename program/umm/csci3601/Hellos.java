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

    private static String isaacsayshello(){
        return "Isaac says 'Hello!'\n" ;
    }

    private static String xaisayshello(){
        return "Xai says 'Hello!'\n" ;
    }

    public static String generateOutput() {
        StringBuilder builder = new StringBuilder();

        builder.append(WELCOME_LINE + "\n");
        builder.append(auroraSaysHello());
        builder.append(isaacsayshello());
        builder.append(jacobSaysHello());
        builder.append(kaiSaysHello());
        builder.append(kkSaysHello());
        builder.append(mattSaysHello());
        builder.append(nicSaysHello());
        builder.append(xaisayshello());

        builder.append(hunter_says_hello());
        builder.append(travis_says_hello());

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



    private static String hunter_says_hello() {
        return "Hunter says 'Hello!'\n";
    }

    private static String travis_says_hello() {
        return "Travis says 'Hello!'\n";
    }
}
