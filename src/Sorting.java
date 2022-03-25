public class Sorting {

    public static void sortByPriority(LinkedList customerList) {
        Node currNode = customerList.head;
        Customer customer;

        if (customerList.head != null) {
            while (currNode != null) {
                // Initialize next node as node after current node
                Node nextNode = currNode.getNextNode();

                while (nextNode != null) {
                    // Check if current and next node are of the same time
                    if (currNode.getData().getTime() == nextNode.getData().getTime()) {
                        // If current node priority is greater than next node priority,
                        // swap the data between them
                        if (currNode.getData().getPriorityNo() > nextNode.getData().getPriorityNo()) {
                            customer = currNode.getData();
                            currNode.setData(nextNode.getData());
                            nextNode.setData(customer);
                        }
                    }
                    // Change next node
                    nextNode = nextNode.getNextNode();
                }
                // Go to next node
                currNode = currNode.getNextNode();
            }
        }
    }

    public static void sortByTime(LinkedList customerList){
        Node currNode = customerList.head;
        Customer customer;

        if(customerList.head != null) {
            while (currNode != null){
                //Node index will point to node next to currNode
                Node nextNode = currNode.getNextNode();

                while (nextNode != null){
                    //If current node data is greater than index's node data,
                    //swap the data between them
                    if(currNode.getData().getTime() > nextNode.getData().getTime()){
                        customer = currNode.getData();
                        currNode.setData(nextNode.getData());
                        nextNode.setData(customer);
                    }
                    nextNode = nextNode.getNextNode();
                }
                currNode = currNode.getNextNode();
            }
        }
    }
}
