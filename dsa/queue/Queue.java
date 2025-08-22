package dsa.queue;

public class Queue {
    int[] queue;
    int maxSize;
    int rare;
    int front;

    public Queue(int size) {
        queue = new int[size];
        maxSize = size;
        rare = -1;
        front = -1;
    }

    public boolean isFull() {
        return rare == maxSize - 1;
    }

    public boolean isEmpty() {
        return front == -1 || front > rare;
    }

    public void enqueue(int el) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1)
            front = 0;
        queue[++rare] = el;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int temp = queue[front++];
        if (front > rare)
            front = rare = -1;
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.peek());

        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        System.out.println(q.peek());
        q.enqueue(6);
        System.out.println(q.isFull());
    }
}
