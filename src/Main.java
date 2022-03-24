public class Main {
    static LinkedList customerlList = new LinkedList();

    public static void main(String[] args) {
        UI.clearScreen(); // clear the screen
        UI.titleCard(); // show a title card

        Customer cus1 = new Customer(20, NameGenerator.getFirstName(), NameGenerator.getLastName(),
                NameGenerator.getGender(), 1001, 1);

        Customer cus2 = new Customer(22, NameGenerator.getFirstName(), NameGenerator.getLastName(),
                NameGenerator.getGender(), 1101, 2);

        Customer cus3 = new Customer(25, NameGenerator.getFirstName(), NameGenerator.getLastName(),
                NameGenerator.getGender(), 1011, 2);

        System.out.println(cus1);
        System.out.println(cus2);
        System.out.println(cus3);

        customerlList.insert(cus1);
        customerlList.insert(cus2);
        customerlList.insert(cus3);

        customerlList.print();
        customerlList.removeById(22);
        customerlList.print();
    }
}
