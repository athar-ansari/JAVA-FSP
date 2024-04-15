/* 

USING SINGLY LINKED LIST ,PERFORM THESE ACTION :

1. INSERT AT START.
2. INSERT AT END.
3. INSERT AT MIDDLE.
4. SHOW.
5. DELETE AT START.
6. DELETE AT END.
7. DELETE AT MIDDLE.
8. END.

*/ 

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void insertAtMiddle(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = head;
            int count = 0;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public void deleteAtStart() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node secondLast = head;
                while (secondLast.next.next != null) {
                    secondLast = secondLast.next;
                }
                secondLast.next = null;
            }
        }
    }

    public void deleteAtMiddle(int position) {
        if (head != null) {
            if (position == 0) {
                head = head.next;
            } else {
                Node previous = head;
                int count = 0;
                while (count < position - 1) {
                    previous = previous.next;
                    count++;
                }
                Node current = previous.next;
                previous.next = current.next;
            }
        }
    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        
        int option = 0;
        while (option != 8) {
            System.out.println("1. Insert at start\n2. Insert at end\n3. Insert at middle\n4. Show\n5. Delete at start\n6. Delete at end\n7. Delete at middle\n8. End");
            System.out.print("ENTER : ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter data : ");
                    int data1 = scanner.nextInt();
                    list.insertAtStart(data1);
                    break;
                case 2:
                    System.out.print("Enter data : ");
                    int data2 = scanner.nextInt();
                    list.insertAtEnd(data2);
                    break;
                case 3:
                    System.out.print("Enter data and position : ");
                    int data3 = scanner.nextInt();
                    int pos3 = scanner.nextInt();
                    list.insertAtMiddle(data3, pos3);
                    break;
                case 4:
                    list.show();
                    break;
                case 5:
                    list.deleteAtStart();
                    break;
                case 6:
                    list.deleteAtEnd();
                    break;
                case 7:
                    System.out.print("Enter position : ");
                    int pos7 = scanner.nextInt();
                    list.deleteAtMiddle(pos7);
                    break;
                case 8:
                    System.out.println("Ending...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }
}



