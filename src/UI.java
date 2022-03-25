
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
        System.out.println(CYAN);

        System.out.println(" _____   ______      ____ ");
        System.out.println("| ___ | | _  _ | || ||  ||");
        System.out.println("||   || || || || || | -- |");
        System.out.println("||   || ||    || || ||  ||");
        System.out.println("||   || ||    || || ||  ||");
        resetColor();
        System.out.println("Flight Arrival Processing\n\n");
        
        pressEnterToContinue();
        clearScreen();
    }

    public static void resetColor() {
        System.out.print(RESET);
    }

    public static void changeColor(String color) {
        System.out.print(color);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pressEnterToContinue() {
        System.out.println(GREEN);
        System.out.println("<< Press Enter to continue >>");
        resetColor();
        try {
            System.in.read();
        } catch (Exception ignored) {}
    }
}
