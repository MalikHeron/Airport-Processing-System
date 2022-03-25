public class Sorting {

    public static void sortByPriority(LinkedList customerList) {
        Node currNode = customerList.head;
        Customer temp;

        if (customerList.head != null) {
            while (currNode != null) {
                //Node index will point to node next to currNode
                Node index = currNode.next;

                while (index != null) {
                    //If current node data is greater than index's node data,
                    //swap the data between them
                    if (currNode.data.getTime() == index.data.getTime()) {
                        if (currNode.data.getPriorityNo() > index.data.getPriorityNo()) {
                            temp = currNode.data;
                            currNode.data = index.data;
                            index.data = temp;
                        }
                    }

                    index = index.next;
                }
                currNode = currNode.next;
            }
        }
    }
}
