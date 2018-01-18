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
        builder.append(john_says_hello());
        builder.append(song_says_hello());
        builder.append(Sungjae_says_hello());
        builder.append(Francisco_says_hello());
        builder.append(hunter_says_hello());
        builder.append(travis_says_hello());
        builder.append(johnHoff_says_hello());
        builder.append(abe_says_hello());
        builder.append(davidSaysHello());
        builder.append(ethanSaysHello());
        builder.append(dustinSaysHello());
        builder.append(chuckSaysHello());
        builder.append(roch_says_hello());
        builder.append(yutaro_says_hello());

        return builder.toString();
    }

    private static String Sungjae_says_hello() {

        return "Sungjae says 'Hello!'\n";
    }

    private static String Francisco_says_hello() {

        return "Francisco says 'Hello!'\n";
    }

    private static String jacobSaysHello() { return "Jacob says 'Hello!'\n";}

    private static String mattSaysHello() { return "Matt says 'Hello!'\n";}

    private static String nicSaysHello() {
        return "Nic says 'Hello!'\n";
    }

    private static String kkSaysHello() {
        return "KK says 'Hello!'\n";
    }

    private static String dustinSaysHello() {
        return "Dustin says 'Hello!'\n";
    }

    private static String chuckSaysHello() {
        return "Chuck says 'Hello!'\n";
    }

    private static String john_says_hello(){
        return "John says 'Hello!'\n";
    }

    private static String song_says_hello(){
        return "Song says 'Hello!'\n";
    }

    private static String auroraSaysHello(){
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

    private static String johnHoff_says_hello(){
        return "John Hoff says 'Hello!'\n";
    }

    private static String abe_says_hello() {
        return "Abe says 'Hello!'\n";
    }

    private static String davidSaysHello() { return "David says 'Hello!'\n"; }

    private static String ethanSaysHello() { return "Ethan says 'Hello!'\n"; }

    private static String roch_says_hello() { return "Roch says 'Hello!'\n"; }

    private static String yutaro_says_hello() { return "Yutaro says 'Hello!'\n"; }
}
