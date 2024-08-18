
public class BinarySearchTree{
 
	Node head;
	
	public void insert(int num) {
		
		head = insert(head, num);
		
	}
 
	public Node insert(Node head, int num) {
 
			Node newNode = new Node(num);
 
			newNode.val = num;
 
 
			if(head == null) {
 
				head = newNode;
 
				return head;
 
			}
 
			else if(num < head.val) {
 
				head.leftChild = insert(head.leftChild, num);
				
				if(head.leftChild == null) {
					head.leftChild.parent = head;
				}
 
			}
 
			else {
 
				head.rightChild = insert(head.rightChild, num);
				
				if(head.rightChild == null) {
					head.rightChild.parent = head;
				}
 
			}
 
			return head;
 
	}
 
 
	public void inOrderPrint(Node head) {
 
		if(head != null) {
 
			inOrderPrint(head.leftChild);
 
			System.out.println(head.val);
 
			inOrderPrint(head.rightChild);
 
		}
 
	}
 
}
