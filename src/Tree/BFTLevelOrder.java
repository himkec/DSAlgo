package Tree;

/*
 * Height of the tree is the distance from root to the leaf.
 * For calculating the height, we need to calculate left and right height
 * and then check if leftHeight is greater or rightHeight
 * 
 * Level Order Traversal, we print elements level by level where level = height
 * for first level we print root.data, if there are more levels then 
 * we print root.left and root.right data recursively
 * 
 */


public class BFTLevelOrder {

		Node root;
		
		BFTLevelOrder(){
			root = null;
		}
		
		int height(Node node){
			if (node == null){
				return 0;
			}
			else{
				int leftHeight = height(node.left);
				int rightHeight = height(node.right);
				
				if (leftHeight > rightHeight){
					return leftHeight + 1;
				}
				else
				
					return rightHeight + 1;
				
			}
		}
		
		void printLevelOrder()
		    {
		        int h = height(root);
		        int i;
		        for (i=1; i<=h; i++)
		            printGivenLevel(root, i);
		    }
		
		 void printGivenLevel (Node root ,int level)
		    {
		        if (root == null)
		            return;
		        if (level == 1)
		            System.out.print(root.data + " ");
		        else if (level > 1)
		        {
		            printGivenLevel(root.left, level-1);
		            printGivenLevel(root.right, level-1);
		        }
		    }
		
		void printKDistant(Node node, int k) 
	    {	
	        if (node == null)
	            return;
	        if (k == 0) 
	        {
	            System.out.print(node.data + " ");
	            return;
	        } 
	        else
	        {
	            printKDistant(node.left, k - 1);
	            printKDistant(node.right, k - 1);
	        }
	    }
		
		boolean printAncestors(Node node, int target) 
	    {
	         /* base cases */
	        if (node == null)
	            return false;
	  
	        if (node.data == target)
	            return true;
	  
	        /* If target is present in either left or right subtree 
	           of this node, then print this node */
	        if (printAncestors(node.left, target)
	                || printAncestors(node.right, target)) 
	        {
	            System.out.print(node.data + " ");
	            return true;
	        }
	  
	        /* Else return false */
	        return false;
	    }
	
	
	public static void main(String args[]) {
		
		BFTLevelOrder tree = new BFTLevelOrder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);
        System.out.println("Height of Tree");
        System.out.println(tree.height(tree.root));
        System.out.println("Level Order : ");
        tree.printLevelOrder();
        System.out.println(" ");
        System.out.println("K Distance : ");
        tree.printKDistant(tree.root, 2);
        System.out.println(" ");
        System.out.println("Print Ancestors : ");
        tree.printAncestors(tree.root, 8);
	}
}
