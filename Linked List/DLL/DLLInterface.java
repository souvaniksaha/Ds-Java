
public interface DLLInterface {
	
	public int getLength(Node head);
	public void printList(Node head);
	
	public Node addFirst(Node head , int data);
	public Node addLast(Node head , int data);
	public Node addElementByPosition(Node head , int data, int position);
	
	//DLL deletion
	public Node delteFromFirst(Node head );
	public Node delteFromLast(Node head);
	public Node deleteElementByPosition(Node head , int position);
	

}
