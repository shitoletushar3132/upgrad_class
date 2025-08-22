package dsa.stack;

class Stack {
    int[] arr;
    int top = -1;

    public Stack(int size) {
        arr = new int[size];
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public void push(int el) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        top++;
        arr[top] = el;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int temp = arr[top];
        top--;
        return temp;
    }
}

class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println(stack.isEmpty());
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(10);
    
        System.out.println(stack.peek());

        System.out.println(stack.isFull());

    }
}