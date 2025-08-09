package DATA_STRUCTURE.TREES.BINARY_SEARCH_TREE;


class BSTNode{
    int val;
    BSTNode left;
    BSTNode right;

    public BSTNode(int item) {
        val = item;
        left = null;
        right = null;
    }
    
}


public class BinarySearchTree {
    BSTNode root;

    //insert a new key
    public BSTNode insert(BSTNode node, int val){
        if( node == null ) return new BSTNode(val);      //thid becomes the root of our tree...This creates a new node with the given value and sets: val, left, right

        if( val < node.val){
            node.left = insert(node.left, val);
        }
        else if ( val > node.val ){
            node.right =insert(node.right, val);
        }

        return node;
    }

    //search for a value
    public boolean search(BSTNode root, int val){
        if( root == null ) return false;  
        if( root.val == val ) return true;
        
        return val < root.val ? search(root.left, val) : search(root.right, val);
    }

    //Delete a node
    public BSTNode delete(BSTNode root, int val) {
        if (root == null) return root;
        
        if (val < root.val) {
            root.left = delete(root.left, val);
        } else if (val > root.val) {
            root.right = delete(root.right, val);
        } else {
            // Node with only one child or no child
            if (root.left == null) return root.right;               //If the node has no left child, just return its right child.
            if (root.right == null) return root.left;               //If the node has no right child, just return its left child.
            
            // Node with two children: Get inorder successor
            root.val = minValue(root.right);
            root.right = delete(root.right, root.val);
        }
        return root;
    }

    private int minValue(BSTNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.val;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        
        
        System.out.println("Search 40: " + tree.search(tree.root, 40)); // true
        System.out.println("Search 90: " + tree.search(tree.root, 90)); // false
        
        tree.root = tree.delete(tree.root, 20);
        System.out.println("After deleting 20: " + tree.search(tree.root, 20)); // false
    }
}
