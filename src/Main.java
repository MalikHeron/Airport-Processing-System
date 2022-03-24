public class Main {
    static LinkedList customerlList = new LinkedList();

    public static void main(String[] args) {
        UI.clearScreen(); // clear the screen
        UI.titleCard(); // show a title card

        Customer cus1 = new Customer(Generator.generateId(), Generator.getFirstName(), Generator.getLastName(),
                Generator.getGender(), Generator.generateFlightNo(), Generator.generatePriority());

        Customer cus2 = new Customer(Generator.generateId(), Generator.getFirstName(), Generator.getLastName(),
                Generator.getGender(), Generator.generateFlightNo(), Generator.generatePriority());

        Customer cus3 = new Customer(Generator.generateId(), Generator.getFirstName(), Generator.getLastName(),
                Generator.getGender(), Generator.generateFlightNo(), Generator.generatePriority());

        System.out.println(cus1);
        System.out.println(cus2);
        System.out.println(cus3);
        System.out.println();

        customerlList.insert(cus1);
        customerlList.insert(cus2);
        customerlList.insert(cus3);
        System.out.println();

        customerlList.print();
        customerlList.removeById(22);
        customerlList.print();
    }
}
