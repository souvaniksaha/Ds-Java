package com.souvanik;

public class CircularLinkedList implements CLLInterface {
    /*Start of getLength() */
    @Override
    public int getLength(Node head) {
        if (head == null) {
            System.out.println("Length of the List 0");
            return 0;
        }
        Node temp = head;
        int count = 0;
        do {
            count++;
        } while (temp != head);

        return count;
    }

    /*End of GetLength()*/
    
    /*  Start of printList */
    @Override
    public void printList(Node head) {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty List!");
            return;
        }
        do {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        } while (temp != head);

    }
    /*End of PrintList*/

    /*  Start of addFirst  */
    @Override
    public Node addFirst(Node head, int data) {
        Node newNode = new Node();
        newNode.setData(data);

        Node currentHead = head;

        if (head == null) {
            newNode.setNext(newNode);
            head = newNode;
        } else {
            while (currentHead.getNext() != head)
                currentHead = currentHead.getNext();

            newNode.setNext(head);
            currentHead.setNext(newNode);
            head = newNode;
        }
        return head;
    }
    /*End of addFirst*/

    /*Start of addLast()*/
    @Override
    public Node addLast(Node head, int data) {
        Node newNode = new Node();
        newNode.setData(data);
        Node currentHead = head;
        if (head == null) {
            newNode.setNext(head);
            head = newNode;
        } else {
            while (currentHead.getNext() != head)
                currentHead = currentHead.getNext();
            currentHead.setNext(newNode);
            newNode.setNext(head);
        }
        return head;
    }
    /*End of addLast*/
}
