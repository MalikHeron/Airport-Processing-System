public class Sorting {

    public static void sortList(LinkedList customerList) {
        sortByPriority(customerList);
        sortByTime(customerList);
    }

    public static void sortByPriority(LinkedList customerList) {
        Node currentNode = customerList.head;
        Customer customer;

        if (customerList.head != null) {
            while (currentNode != null) {
                // Initialize next node as node after current node
                Node nextNode = currentNode.getNextNode();

                while (nextNode != null) {
                    // Check if current and next node are of the same time
                    if (currentNode.getData().getTime() == nextNode.getData().getTime()) {
                        // If current node priority is greater than next node priority,
                        // swap the data between them
                        if (currentNode.getData().getPriorityNo() > nextNode.getData().getPriorityNo()) {
                            customer = currentNode.getData();
                            currentNode.setData(nextNode.getData());
                            nextNode.setData(customer);
                        }
                    }
                    // Change next node
                    nextNode = nextNode.getNextNode();
                }
                // Go to next node
                currentNode = currentNode.getNextNode();
            }
        }
    }

    public static void sortByTime(LinkedList customerList){
        Node currentNode = customerList.head;
        Customer customer;

        if(customerList.head != null) {
            while (currentNode != null){
                //Node index will point to node next to currentNode
                Node nextNode = currentNode.getNextNode();

                while (nextNode != null){
                    //If current node data is greater than next node data,
                    //swap the data between them
                    if(currentNode.getData().getTime() > nextNode.getData().getTime()){
                        customer = currentNode.getData();
                        currentNode.setData(nextNode.getData());
                        nextNode.setData(customer);
                    }
                    nextNode = nextNode.getNextNode();
                }
                currentNode = currentNode.getNextNode();
            }
        }
    }
}
