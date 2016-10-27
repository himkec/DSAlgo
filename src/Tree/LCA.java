package Tree;

public class LCA {
	
	public static Node lowestCommonAncestor(Node root, Node a, Node b) {
	    if (root == null) {
	        return null;
	    }
	    
	    if (root.equals(a) || root.equals(b)) { 
	        // if at least one matched, no need to continue
	        // this is the LCA for this root
	        return root;
	    }

	    Node l = lowestCommonAncestor(root.left, a, b);
	    Node r = lowestCommonAncestor(root.right, a, b);

	    if (l != null && r != null) {
	    	return root;  // nodes are each on a seaparate branch
	    }

	    // either one node is on one branch, 
	    // or none was found in any of the branches
	    return l != null ? l : r;
	}
	
	

}

