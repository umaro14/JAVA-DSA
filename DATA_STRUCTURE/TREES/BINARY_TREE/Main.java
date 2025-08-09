package DATA_STRUCTURE.TREES.BINARY_TREE;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        
        System.out.println("Pre-order:");
        tree.preOrder(tree.root);  // 1 2 4 5 3 6 7
        
        System.out.println("\nIn-order:");
        tree.inOrder(tree.root);   // 4 2 5 1 3
        
        System.out.println("\nPost-order:");
        tree.postOrder(tree.root); // 4 5 2 3 1 which is one 
        
        System.out.println("\nLevel-order:");
        tree.levelOrder();         // 1 2 3 4 5
    }

    
}
