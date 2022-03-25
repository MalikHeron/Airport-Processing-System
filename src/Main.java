public class Main {

    static LinkedList customerList = new LinkedList();

    public static void main(String[] args) {
        UI.clearScreen(); // clear the screen
        UI.titleCard(); // show a title card
        customerList = Generator.generateCustomers(); // list of customers

        System.out.println();

        customerList.print();
        //customerList.removeById(22);
        //customerList.print();
    }
}
