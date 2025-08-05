package DATA_STRUCTURE.TREES.GENERAL_TREE;

import java.util.ArrayList;
import java.util.List;

class TreeNode<T> {
    T data;
    List<TreeNode<T>> children;                      //Children is list that Holds TreeNode that can holde data and reference to the next node
    
    public TreeNode(T data){
        this.data = data;
        this.children = new ArrayList<>();
    }
}



public class GeneralTree<T> {
    private TreeNode<T> root;

    public GeneralTree(){
        this.root = null;
    }

    // Check if tree is empty
     public boolean isEmpty(){
        return root == null;
     }

     //add root node
     public void addRoot(T data){
        if(root != null) throw new IllegalStateException("Tree already has a root");
        root = new TreeNode<>(data);
     }

    // Add child to a parent node
    public void addChild(TreeNode<T> parent, T data){
        if(parent == null) throw new IllegalArgumentException("Parent Cannot be NUll");
        TreeNode<T> child = new TreeNode<>(data);        //this child is an object of TreeNode class it casn hold data and reference to the next node
        parent.children.add(child);
    }

    // DFS Traversal (Pre-order)...This means you are processing the node before its children — this is called pre-order traversal.
     public void traverseDFS(TreeNode<T> node) {
        if (node == null) return;
        
        System.out.print(node.data + " ");
        for (TreeNode<T> child : node.children) {                           //Recursive
            traverseDFS(child);
        }
    }

    // BFS Traversal
    public void traverseBFS() {
        if (root == null) return;
        
        List<TreeNode<T>> queue = new ArrayList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.remove(0);   //Remove the node at the front of the queue (this simulates a queue’s FIFO behavior).This is the node we're currently visiting.
            System.out.print(current.data + " ");          //removed node
            queue.addAll(current.children);                //These children will be visited in the next rounds of the loop.
        }
    }

    // Find node with given data (DFS search)
    public TreeNode<T> findNode(TreeNode<T> node, T data){
        if(node == null) return null;
        if(node.data.equals(data)) return node;

        for(TreeNode<T> child : node.children){
            TreeNode<T> found = findNode(child, data);
            if(found != null) return found;
        }

        return null;
    }

    // Calculate tree height
    public int getHeight(TreeNode<T> node) {
        if (node == null) return 0;
        
        int maxHeight = 0;
        for (TreeNode<T> child : node.children) {
            int childHeight = getHeight(child);
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        
        return maxHeight + 1;
    }


    public static void main(String[] args) {
        GeneralTree<String> tree = new GeneralTree<>();
        
        // Build the tree
        tree.addRoot("A");
        TreeNode<String> root = tree.findNode(tree.root, "A");
        
        tree.addChild(root, "B");
        tree.addChild(root, "C");
        tree.addChild(root, "D");
        
        TreeNode<String> nodeB = tree.findNode(root, "B");
        tree.addChild(nodeB, "E");
        tree.addChild(nodeB, "F");
        
        TreeNode<String> nodeD = tree.findNode(root, "D");
        tree.addChild(nodeD, "G");
        
        // Traversals
        System.out.println("DFS Traversal:");
        tree.traverseDFS(tree.root); // A B E F C D G
        
        System.out.println("\nBFS Traversal:");
        tree.traverseBFS(); // A B C D E F G
        
        // Height calculation
        System.out.println("\nTree height: " + tree.getHeight(tree.root)); // 3
    }

}
