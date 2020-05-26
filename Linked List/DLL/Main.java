
public class Main {

	public static void main(String[] args) {
		
		DoubleLinkedList list = new DoubleLinkedList();
		Node head = new Node();
		Node one = new Node();
		Node two = new Node();
		
		head.setPrevious(null);
		head.setData(20);
		head.setNext(one);
		one.setPrevious(head);
		one.setData(30);
		one.setNext(two);
		two.setPrevious(one);
		two.setData(40);
		two.setNext(null);
		
		
		//list.printList(head);
	   System.out.print(list.getLength(head));
	  list.printList(list.addElementByPosition(head, 100, 1));
	 
       
	}

}
