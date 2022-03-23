public class Main {
    static LinkedList customerlList = new LinkedList();;

    public static void main(String[] args) {
        
	    Customer cus1 = new Customer(20, "Don", "Gang", "Male", 1001, 1);
        System.out.println(cus1);

        customerlList.insert(new Customer());
    }
}
