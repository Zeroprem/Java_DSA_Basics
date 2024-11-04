package Vinsys;
class stack {
    int size = 3;
    private int arr[] = new int[size];
    int top = -1;
    void push(int data) {
    	if(top<size-1) {
        top++;
        arr[top] = data;}
    }
    int pop() {
    	if(top>=0) {
        int x = arr[top];
        top--;
        return x;}
    	else{
    		return -1;
    	}
    }
    int peek() {
    	if(top>=0) {
        return arr[top];}
    	else {
    		return -1;
    	}
    }
    int size() {
        return top + 1;
    }
    boolean isEmpty() {
        return top == -1;
    }
}
public class StackDemo {

	public static void main(String[] args) {
		 stack s = new stack();
		 System.out.println("stack " + s.isEmpty());
	        s.push(6);
	        s.push(3);
	        s.push(7);
	        System.out.println("Top of the stack" + s.peek());
	        System.out.println("Size of the stack" + s.size());
	        System.out.println("The element deleted is " + s.pop());
	        System.out.println("Size of the stack after deleting an element " + s.size());
	        System.out.println("Top of the stack after deleting an element " + s.peek());

	}

}
