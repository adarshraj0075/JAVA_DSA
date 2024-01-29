

public class stackUsingArray {
    private int[] arr;
    private int top;
    private int capacity;

    public stackUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
           System.out.println("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
