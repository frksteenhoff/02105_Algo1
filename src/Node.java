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
		Node a = new Node();
		Node b = new Node();
		Node c = new Node();
		Node d = new Node();
		Node e = new Node();
		Node f = new Node();

		// Assigning key values to the nodes
		head.key = "Hello";
		a.key = "Who";
		b.key = "Are";
		c.key = "You,";
		d.key = "My";
		e.key = "Friend";

		// Linking the nodes to each other
		head.prev = null;
		head.next = a;
		a.prev = head;
		a.next = b;
		b.prev = a;
		b.next = c;
		c.prev = b;
		c.next = d;
		d.prev = c;
		d.next = e;
		e.prev = d;
		e.next = null;

		printNodes(head);
		//Inserting node
		Insert(head, f);
		printNodes(f);
		// Swapping nodes a and e
		Swap(a,e);
		printNodes(f);
		// Swapping nodes b and d
		Swap(b,d);
		printNodes(f);
		// Swapping nodes f and a
		Swap(f,a);
		printNodes(a);

	}
	
	public static Node Insert(Node head, Node x){
		x.prev = null;
		x.next = head;
		head.prev = x;
		return x;

	}
	public static void Swap(Node x, Node y){
		// Introduction temporary node
		Node tmp = new Node();
		tmp.next = y.next;
		tmp.prev = y.prev;

		if(x.prev == null && y.next == null){
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

		// Doing the swap
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
