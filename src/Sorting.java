public class Sorting {

    public static void sortByPriority(LinkedList customerList) {
        Node currNode = customerList.head;
        Customer temp;

        if (customerList.head != null) {
            while (currNode != null) {
                // Initialize next node as node after current node
                Node nextNode = currNode.next;

                while (nextNode != null) {
                    // Check if current and next node are of the same time
                    if (currNode.data.getTime() == nextNode.data.getTime()) {
                        // If current node priority is greater than next node priority,
                        // swap the data between them
                        if (currNode.data.getPriorityNo() > nextNode.data.getPriorityNo()) {
                            temp = currNode.data;
                            currNode.data = nextNode.data;
                            nextNode.data = temp;
                        }
                    }
                    // Change next node
                    nextNode = nextNode.next;
                }
                // Go to next node
                currNode = currNode.next;
            }
        }
    }
}
