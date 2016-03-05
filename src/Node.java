/*
 * Henriette Steenhoff, s134869
 * 02105 - Algoritmer og Datastrukturer 1
 * Mandatory 4
 */
public class Node {

	String key;
	Node next;
	Node prev;

	public static void main(String[] args){
		Node head = new Node();

		// Inserting all wanted nodes
		Insert("You",head);
		Insert("Are",head);
		Insert("Who",head);
		Insert("Friend",head);
		Insert("My",head);
		Insert("Hello",head);
		
		// Print the initial linked list
		printNodes(head);
		// Swapping nodes a and e
		Swap(a,f);
		printNodes(head.prev);
		// Swapping nodes b and d
		Swap(b,d);
		printNodes(head.prev);
		// Swapping nodes f and a
		Swap(head.prev,a);
		printNodes(head);

	}

	public static Node Insert(String s, Node head){
		Node newNode = new Node();
		newNode.key = s;

		// When the linked list is empty
		if(head.next == null){
			head.next = newNode;
			newNode.next = null;
			newNode.prev = head;

		// When there is nodes besides head in the list
		} else{
			head.next.prev = newNode;
			newNode.next = head.next;
			newNode.prev = head;
			head.next = newNode;
		}
		
		return newNode;
	}

	public static void Swap(Node x, Node y){
				
		// Introduction temporary node
		Node tmp = new Node();
		tmp.next = y;
		tmp.prev = x;

		if(x.prev == null && y.next == null){
			// Swap when both nodes have next/prev equal to null 
			x.next.prev = y;
			y.prev.next = x;

		} else if(y.next == null){
			// Swap on end of linked list
			x.next.prev = y;
			y.prev.next = x;	
			x.prev.next = y;

		} else if(x.prev == null){ 
			// Swap in start of linked list
			y.next.prev = x;
			y.prev.next = x;	
			x.prev.next = y;

		} else {
			// Anywhere else
			// Linking the two ends properly
			x.next.prev = y;
			y.next.prev = x;
			y.prev.next = x;	
			x.prev.next = y;
		}	

		// Performing the swap
		y.next = x.next;
		x.next = tmp.next;
		y.prev = x.prev;
		x.prev = tmp.prev;
	}

	public static void printNodes(Node node){
		String ListElem = node.key + " ";

		while(node.next != null){
			node = node.next;
			ListElem += node.key + " ";
		}
		System.out.println(ListElem);
	}
}
