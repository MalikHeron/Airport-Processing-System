public class Sorting {

    public static void sortList(LinkedList customerList) {
        Node currentNode = customerList.head;
        LinkedList tempList = new LinkedList(); // temporary list
        int priority = 1;

        if (customerList.head != null) {
            while (priority <= 2) {
                // Execute while currentNode is not null
                while (currentNode != null) {
                    // If current node priority is equal to priority,
                    // insert data into temporary list
                    if (currentNode.getData().getPriorityNo() == priority) {
                        tempList.insert(currentNode.getData());
                    }

                    // Go to next node
                    currentNode = currentNode.getNextNode();
                }
                // Reset current node
                currentNode = customerList.head;
                // Increment priority by 1
                priority++;
            }
            // Set customerList as the temporary list
            customerList.head = tempList.head;
        }
    }
}
