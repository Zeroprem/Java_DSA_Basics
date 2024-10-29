package Vinsys;
class Node {
    int data;
    Node next;

}


class LinkedList1 {
    Node head;

   
    public void insert(int data) {
      
        Node newNode = new Node();
        newNode.data=data;

       
        if (head == null) {
            head = newNode;
        } else {
           
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            
            current.next = newNode;
        }
    }

    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

public void insertAtStart(int data) {
    Node newNode = new Node();
    newNode.data=data;
    newNode.next = head; 
    head = newNode;     
}


public void insertAt(int index, int data) {
    if (index == 0) {
        insertAtStart(data);
        return;
    }

    Node newNode = new Node();
    Node current = head;

    for (int i = 0; i < index - 1 && current != null; i++) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Index out of bounds");
        return;
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
        head = head.next;
        return;
    }

    Node current = head;
    Node previous = null;

    for (int i = 0; i < index && current != null; i++) {
        previous = current;
        current = current.next;
    }

    if (current == null) {
        System.out.println("Index out of bounds");
        return;
    }

    previous.next = current.next;
}}
public class LinkedList {

	public static void main(String[] args) {
	
		
		LinkedList1 a=new LinkedList1();
		a.insert(0);
		a.insert(1);
		a.insert(2);
		a.insertAt(1,11);
		a.deleteAt(1);e
		a.display();

	}

}
