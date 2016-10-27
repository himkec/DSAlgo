package Tree;

public class BinarySearchTree {
	// Root of BST
    Node root;
 
    // Constructor
    BinarySearchTree() { 
        root = null; 
    }
    
 // This method mainly calls insertRec()
    void insert(int data) {
       root = insertRec(root, data);
    }
     
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int data) {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(data);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder()  {
       inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
    
 // A utility function to search a given key in BST
    public Node search(Node root, int data)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.data==data)
            return root;
     
        // val is greater than root's key
        if (root.data > data)
            return search(root.left, data);
     
        // val is less than root's key
        return search(root.right, data);
    }
    
    // This method mainly calls deleteRec()
    void deleteKey(int data)
    {
        root = deleteRec(root, data);
    }
 
    /* A recursive function to delete a new key in BST */
    Node deleteRec(Node root, int data)
    {
        /* Base Case: If the tree is empty */
        if (root == null)  return root;
 
        /* Otherwise, recur down the tree */
        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);
 
        // if key is same as root's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.data = minValue(root.right);
 
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }
 
        return root;
    }
 
    int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(50);
        tree.insert(60);
        tree.insert(80);
        tree.insert(90);
 
        // print inorder traversal of the BST
        tree.inorder();
        try{
        	Node test = tree.search(tree.root, 90);
            //System.out.println(test.data);
        }
        catch (Exception e){
        	System.out.println("Element not found");
        }
        tree.deleteKey(70);
     // print inorder traversal of the BST
        System.out.println("After deletion");
        tree.inorder();
        System.out.println("Minimum value is : " + tree.minValue(tree.root));
        
    }
}
