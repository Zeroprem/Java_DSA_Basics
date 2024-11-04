package Vinsys;

class Queue{
	private int queueArray[];
	private int  size;
	private int front;
	private int rear;
	private int capacity;
	public Queue(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.size = 0;
        this.rear = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        
        rear = (rear + 1) % capacity;
        queueArray[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return -1;
        }
        return queueArray[front];
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        
        int item = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + item);
    }

    private boolean isEmpty() {
        return size == 0;
    }
    private boolean isFull() {
        return size == capacity;
    }
}

public class QueueImp {

	public static void main(String[] args) {
		 Queue q = new Queue(6);
	        q.enqueue(4);
	        q.enqueue(14);
	        q.enqueue(24);
	        q.enqueue(34);
	        q.dequeue();
	        System.out.print(q.peek());

	}

}
