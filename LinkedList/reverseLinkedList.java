package LinkedList;

public class reverseLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = next;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("The list is empty");
        }

        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }

        System.out.print("Null");

    }

    public void addLast(String data) {

        Node newNode = new Node(data);

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node currentNode = head.next;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prev;

            // update
            prev = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prev;
    }

    public static void main(String[] args) {
        reverseLinkedList list = new reverseLinkedList();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");

        list.print();
    }

}
