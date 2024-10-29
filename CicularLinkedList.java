package Vinsys;


class Node {
    int data;
    Node next;
}

class CircularLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public void insertAtStart(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = head;
            head = newNode;
            current.next = head;
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
            if (current == head) {
                System.out.println("Index out of bounds");
                return;
            }
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAt(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (index == 0) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            if (head.next == head) { 
                head = null;
            } else {
                head = head.next;
                current.next = head;
            }
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
            if (current.next == head) {
                System.out.println("Index out of bounds");
                return;
            }
        }

        current.next = current.next.next;
    }
}

public class CicularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insertAt(1, 11);
        list.deleteAt(1);

        list.display();
    }
}

