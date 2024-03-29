public class LinkedList {
    Node head; // head of list

    // Method to insert a new node
    public void insert(Customer data) {
        // Create a new node with given data
        Node new_node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (this.head == null) {
            this.head = new_node;
        } else {
            // Else traverse till the last node and insert the new_node there
            Node last = this.head;

            while (last.getNextNode() != null) {
                last = last.getNextNode();
            }

            // Insert the new_node at last node
            last.setNextNode(new_node);
        }
    }

    // Method to delete 3 to 5 Customers from the LinkedList
    public void remove() {
        while (head != null) {
            // Generate random number from 3 to 5
            int random = (int) (Math.random() * (3) + 3);

            UI.pressEnterToContinue();
            UI.changeColor(UI.RED);
            System.out.println("Removing " + random + " customers...\n");
            UI.sleep();
            UI.resetColor();

            for (int i = 0; i < random; i++) {
                // If head is not null remove customer
                if (head != null) {
                    System.out.println(head.getData() + " removed.");
                    head = head.getNextNode();
                }
            }

            // Display current list
            System.out.println();
            UI.changeColor(UI.BLUE);
            System.out.println("Remaining customers: ");
            UI.resetColor();
            print();
        }
    }

    // Method to print the LinkedList.
    public void print() {
        // Check if head is null show that list is empty
        if (head == null) {
            UI.changeColor(UI.YELLOW);
            System.out.println("There are no customers in the list.");
            UI.resetColor();
        } else {
            Node currentNode = this.head;

            for (int time = 0; time <= 2; time++) {
                // Traverse the LinkedList
                while (currentNode != null) {
                    System.out.println(currentNode.getData());
                    // Go to next node
                    currentNode = currentNode.getNextNode();
                }
            }
        }
    }
}
