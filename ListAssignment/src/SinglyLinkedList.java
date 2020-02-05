
public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		
	}
	// SLL methods go here. As a starter, this is how to add a node to the list
	
	// Adding a Node
	public void add(int value) {
		Node newNode = new Node(value);		// Instantiate a node
		if(head == null) {					// Verify if head has a value
			head = newNode;					// If not, assign value of newNode
		}else {					
			Node runner = head;				// If yes, grab the value of the newNode
			while(runner.next != null) {	// If the next node is there..
				runner = runner.next;		// Move on to that node
			}
			runner.next = newNode;			// 
		}
	}
	
	// Removing a Node
	public void remove(int value) {
		Node runner = head;
		while(runner.next != null) {
			if (head.value == value) {
				// take the value from runner.next and assign it to runner
				runner = runner.next;
			}
		}
	}
	
	// Printing the array
	public void printValues() {
		Node runner = head;
		
		while(runner.next != null) {
			System.out.println(head.value);
		}
	}
}
