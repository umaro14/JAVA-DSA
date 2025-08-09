package DATA_STRUCTURE.TREES.BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


//UMAR BALDE-14
public class BinaryTree {
    TreeNode root;

    // Pre-order traversal (Root -> Left -> Right)
    public void preOrder(TreeNode node){
        if( node == null ) return;
        System.out.println(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    // In-order traversal (Left -> Root -> Right)
    //👉 The algorithm always goes to the leftmost node first, ignoring everything else (even the right child of the root) until it can’t go left anymore.
    public void inOrder(TreeNode node){
        if( node == null ) return;
        inOrder(node.left);
        System.out.println(node.val + " ");
        inOrder(node.right);
    }

    // Post-order traversal (Left -> Right -> Root)
    public void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

     // Level-order traversal (BFS)
    public void levelOrder() {
        if (root == null) return;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

}
