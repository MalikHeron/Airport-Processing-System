public class Main {
    static LinkedList customerList = new LinkedList();

    public static void main(String[] args) {
        UI.clearScreen(); // clear the screen
        UI.titleCard(); // show a title card

        for(int i = 0; i < (int) (Math.random() * (6) + 1); i++) {
            customerList.insert(new Customer(Generator.generateId(), Generator.getFirstName(), Generator.getLastName(),
                    Generator.getGender(), Generator.generateFlightNo(), Generator.generatePriority(), Generator.generateTime()));
        }

        System.out.println();

        customerList.print();
        //customerList.removeById(22);
        //customerList.print();
    }
}
