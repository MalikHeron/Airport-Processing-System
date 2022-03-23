public class LinkedList {
    Node head; // head of list

    // Linked list Node
    static class Node {
        Customer data;
        Node next;

        Node(Customer d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public void insert(Customer data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (this.head == null) {
            this.head = new_node;
        }
        else {
            // Else traverse till the last node and insert the new_node there
            Node last = this.head;

            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        System.out.println("inserted");
    }

    // Method to delete a Customer from the LinkedList by ID
    public void removeById(int searchID)
    {
        // Store head node
        Node currNode = this.head;
        Node prev = null;

        // If head node itself holds the key to be deleted

        if (currNode != null && currNode.data.getId() == searchID) {
            this.head = currNode.next; // Change the head

            System.out.println(searchID + " deleted");
            return; // exit the function
        }

        // the ID is somewhere else in the list so search for it,
        // keep track of the previous node as it is needed to change currNode.next
        while (currNode != null && !(currNode.data.getId() == searchID)) {
            prev = currNode;
            currNode = currNode.next;
        }

        // If the ID was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;
            System.out.println(searchID + " deleted");
        }

        // If key was not present in linked list
        if (currNode == null)
            System.out.println(searchID + " not found");

    }

    // Method to print the LinkedList.
    public void print()
    {
        Node currNode = this.head;
        System.out.print("Customers: \n");

        // Traverse the LinkedList
        while (currNode != null) {
            System.out.printf(
                    "[ID: %i \nName: %s %s \nGender: %s \nFlight No.: %i \nPriority: %i] \n",
                    currNode.data.getId(),
                    currNode.data.getFName(),
                    currNode.data.getLName(),
                    currNode.data.getGender(),
                    currNode.data.getFlightNo(),
                    currNode.data.getPriorityNo()
            );

            // Go to next node
            currNode = currNode.next;
        }
    }
}
