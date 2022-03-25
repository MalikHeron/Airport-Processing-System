public class Main {

    static LinkedList customerList = new LinkedList();

    public static void main(String[] args) {
        UI.clearScreen(); // clear the screen
        UI.titleCard(); // show a title card
        customerList = Generator.generateCustomers();

        System.out.println();
        
        customerList.sortByPriority();
        customerList.sortByTime();
        
        customerList.print();
        //customerList.removeById(22);
        //customerList.print();
    }
}
