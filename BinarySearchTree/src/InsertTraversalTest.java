
public class InsertTraversalTest {
	
	public static void main(String[] args) { 
		 
		BinarySearchTree BiTree = new BinarySearchTree();
		
		 
		BiTree.insert(17);
		 
		BiTree.insert(2);
		 
		BiTree.insert(43);
		 
		BiTree.insert(57);
		 
		BiTree.insert(9);
		 
		BiTree.insert(12);
		 
		BiTree.insert(5);
		 
		BiTree.insert(10);
		 
		BiTree.insert(66);
		 
		BiTree.insert(82); 
		
		 
		BiTree.inOrderPrint(BiTree.head);
		 
	}
	
}
