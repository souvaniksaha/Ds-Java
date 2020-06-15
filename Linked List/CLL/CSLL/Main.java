package com.souvanik;

public class Main {

    public static void main(String[] args) {
	  Node head = new Node();
	  Node second = new Node();
	  head.setData(1930);
	  head.setNext(second);
	  second.setData(500);
	  second.setNext(head);
	  CircularLinkedList clist = new CircularLinkedList();

      clist.printList(clist.addFirst(head,100));
    }
}
