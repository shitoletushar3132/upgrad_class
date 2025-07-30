package dsa.linkedList;

public class LinkedList {
    static Node<Integer> head = null;
    static Node<Integer> tail = null;

    public static void printLL(Node head) {
        Node<Integer> curr = head;
        while (curr != null) {
            System.out.print(curr.getValue() + "->");
            curr = curr.getNext();
        }
        System.out.print("null");
        System.out.println();
    }

    public static boolean addLL(int value) {
        Node created = new Node<>(value);
        if (head == null) {
            head = created;
            tail = created;

        } else {
            tail.setNext(created);
            tail = created;
        }
        return true;
    }

    public static boolean addFirstLL(int value) {
        Node created = new Node<>(value);
        created.setNext(head);
        head = created;

        return true;
    }

    public static boolean addBetweenLL(int value, int nextTo) {
        Node created = new Node<>(value);
        Node curr = head;
        int i = 1;

        while (curr != null && i < nextTo) {
            curr = curr.getNext();
            i++;
        }
        Node temp = curr.getNext();
        curr.setNext(created);
        created.setNext(temp);
        return true;

    }

    public static int deleteFirst() {
        if (head == null) {
            return 0;
        }
        Node temp = head;
        head = head.getNext();
        return (int) temp.getValue();
    }

    public static int deleteLast() {
        Node curr = head;

        if (head == null || head.getNext() == null) {
            return 0;
        }

        while (curr.getNext().getNext() != null) {
            curr = curr.getNext();
        }
        int value = (int) curr.getValue();

        tail = curr;
        curr.setNext(null);
        return value;
    }

    public static int deleteBetween(int deleteNN) {
        if (head == null || head.getNext() == null) {
            return 0;
        }
        Node curr = head;
        int i = 1;

        while (curr != null && i < deleteNN-1) {
            curr = curr.getNext();
            i++;
        }

        Node temp = curr.getNext();
        curr.setNext(temp.getNext());

        return (int) temp.getValue();
    }

    public static void main(String[] args) {

        addLL(4);
        addLL(5);
        addLL(4);
        printLL(head);
        addFirstLL(10);
        printLL(head);
        addBetweenLL(3943, 2);
        printLL(head);

        deleteFirst();
        printLL(head);

        deleteLast();
        printLL(head);

        addLL(40);
        addLL(50);
        addLL(40);
        printLL(head);

        deleteBetween(2);
        printLL(head);

    }

}
