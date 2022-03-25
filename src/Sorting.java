public class Sorting {

    public static void sortByPriority(LinkedList customerList) {
        Node currNode = customerList.head;
        Customer temp;

        if (customerList.head != null) {
            while (currNode != null) {
                // Node index will point to node next to currNode
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

                    nextNode = nextNode.next;
                }
                currNode = currNode.next;
            }
        }
    }
}
