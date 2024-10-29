package Vinsys;






class Node {
    int data;
    Node next;
    Node prev;
}

class DoublyLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtStart(int data) {
        Node newNode = new Node();
        newNode.data = data;
        
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node();
        newNode.data = data;
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
            if (current == null) {
                System.out.println("Index out of bounds");
                return;
            }
        }

        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void deleteAt(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (index == 0) {
            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
            if (current == null) {
                System.out.println("Index out of bounds");
                return;
            }
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        current.prev.next = current.next;
    }
}

public class DoublyList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insertAt(1, 11);
        list.deleteAt(1);

        list.display();
    }
}

