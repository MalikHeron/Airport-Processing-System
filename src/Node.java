class Node {
    private final Customer data;
    private Node nextNode;

    // Primary Constructor
    public Node(Customer data) {
        this.data = data;
        nextNode = null;
    }

    public Customer getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}