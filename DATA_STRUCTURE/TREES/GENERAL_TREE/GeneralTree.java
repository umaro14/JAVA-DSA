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
}
