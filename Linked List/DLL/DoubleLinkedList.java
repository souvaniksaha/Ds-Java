
public class DoubleLinkedList implements DLLInterface {
   

	public void printList(Node head) {
		
		if(head == null)
			return;
		Node current = head;
		while(current!=null) {
			System.out.print(current.getData()+" ");
			current = current.getNext();
		}
	}

	@Override
	public Node addFirst(Node head, int data) {
	    Node current = head;
		Node newNode = new Node();
		newNode.setPrevious(null);
		newNode.setData(data);
		
	
		if(head == null) {
			newNode.setNext(null);
			head = newNode;
		}
		 current.setPrevious(newNode);
		 newNode.setNext(current);
		 head = newNode;
		 current = null;
		
	 return head;
	}

	@Override
	public Node addLast(Node head, int data) {
		Node current = head;
		Node newNode = new Node();
		newNode.setPrevious(null);
		newNode.setData(data);
		
		if(head == null) {
			head = newNode;
			newNode.setNext(null);
		}else {
			while (current.getNext()!=null)
				current = current.getNext();
			
			current.setNext(newNode);
			newNode.setPrevious(current);
			newNode.setNext(null);
			current = null;	
		}
		return head;
	}

	@Override
	public int getLength(Node head) {
		Node current = head;
		int length = 0;
		while(current!=null) {
			length++;
			current = current.getNext();
		}
		return length;
	}

	@Override
	public Node addElementByPosition(Node head, int data , int pos) {
		Node current = head;
		if(pos == 1)
			head = addFirst(head, data);
		else if(pos == getLength(head) + 1)
			head = addLast(head, data);
		else if(pos>1 && pos<=getLength(head)) {
			Node newNode = new Node();
			newNode.setData(data);
			
			for(int i=1 ; i<pos ; i++)
				current = current.getNext();
			
			current.getPrevious().setNext(newNode);
			newNode.setPrevious(current.getPrevious());
			newNode.setNext(current);
			
		}else
			System.out.println("Position is Invalid!");
			
		return head;
		
	}
	@Override
	public Node delteFromFirst(Node head) {
		if(head == null)
	      System.out.println("List is Empty.Nothing to delete.");
		else if(getLength(head) == 1) {
			head = null;
		    System.out.println("Node deleted Successfully!");
		}else {
			head = head.getNext();
			head.setPrevious(null);
		}
		return head;
	}

	@Override
	public Node delteFromLast(Node head) {
		Node current = head;
		if(head == null)
		      System.out.println("List is Empty.Nothing to delete.");
	  else if(getLength(head) == 1) {
		  head = null;
		  System.out.println("Node deleted Successfully!");
	  }else {
		  
		  while(current.getNext()!=null)
			  current= current.getNext();
		  
		  current.getPrevious().setNext(null);
	  }
		
		return head;
	}

	@Override
	public Node deleteElementByPosition(Node head, int position) {	
	   if(position <=0  || position>getLength(head))
		   System.out.println("Enter a valid position!");
	   else if(position == 1)
		head = delteFromFirst(head);
	   else if(position == getLength(head))
		 head = delteFromLast(head);
	   else {
		   Node current = head;
		  for(int i = 1 ; i<position ;i++)
			   current = current.getNext();
		  
		 current.getPrevious().setNext(current.getNext()); 
		 current.getNext().setPrevious(current.getPrevious());  
	   }
		return head;
	}
}
