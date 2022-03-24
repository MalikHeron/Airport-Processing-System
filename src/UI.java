import java.util.concurrent.TimeUnit;

public class UI {
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m"; // WHITE
    
    public static void titleCard() {
        System.out.println("\n ______");
        System.out.println("\n| ____ | || || || || //\\\\");
        System.out.println("\n||    || || || || || //=\\\\");
        System.out.println("\n||    || || || || || //\\\\");
        System.out.println("\n||    || || || || || //\\\\");
        resetColor();

        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // clearScreen();
    }
    
    public static void resetColor() {
        System.out.println(RESET);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
