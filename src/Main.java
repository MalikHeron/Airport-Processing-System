public class Main {

    static LinkedList customerList = new LinkedList();

    public static void main(String[] args) {
        //UI.clearScreen(); // clear the screen
        //UI.titleCard(); // show a title card

        // First list of customers
        Generator.generateCustomers(customerList);
        customerList.print(); // Print list
        Report.generateReport(customerList); // Generate Report

        // Second list of customers
        Generator.generateCustomers(customerList);
        customerList.print(); // Print list
        Report.generateReport(customerList); // Generate Report

        //customerList.remove();
        //customerList.print();
    }
}
