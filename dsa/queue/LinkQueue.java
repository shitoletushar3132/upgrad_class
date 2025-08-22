package dsa.queue;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class LinkQueue {
    Node head = null;
    Node tail = null;
    int maxSize;
    int currSize;

    LinkQueue(int maxSize) {
        this.maxSize = maxSize;
        currSize = 0;
    }

    void enqueue(int val) {
        if (isFull()) {
            System.out.println("Is Full");
            return;
        }
        Node newNode = new Node(val);
        currSize++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Is Empty");
            return -1;
        }
        int temp = head.val;
        head = head.next;
        currSize--;
        if (head == null) {
            tail = null;
        }
        return temp;
    }

    boolean isFull() {
        return currSize == maxSize;
    }

    boolean isEmpty() {
        return currSize == 0;
    }

    int peak() {
        if (isEmpty()) {
            System.out.println("It is Empty");
            return -1;
        }
        return head.val;
    }

    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue(3);
        System.out.println(linkQueue.isFull());
        System.out.println(linkQueue.isEmpty());
        linkQueue.enqueue(32);
        linkQueue.enqueue(34);
        linkQueue.enqueue(36);
        linkQueue.enqueue(38);

        linkQueue.enqueue(38);
        System.out.println(linkQueue.peak());
        System.out.println(linkQueue.isFull());
        System.out.println(linkQueue.isEmpty());
        System.out.println(linkQueue.dequeue());
        System.out.println(linkQueue.peak());
        linkQueue.enqueue(40);
    }

}
