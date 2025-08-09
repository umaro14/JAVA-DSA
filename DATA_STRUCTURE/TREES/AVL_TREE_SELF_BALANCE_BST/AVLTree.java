package DATA_STRUCTURE.TREES.AVL_TREE_SELF_BALANCE_BST;

class AVLNode {
    int val;
    int height;

    AVLNode left;
    AVLNode right;

    public AVLNode(int val) {
        this.val = val;
        this.height = 1;
    }

    
}



public class AVLTree {
    AVLNode root;

    private int height(AVLNode node){
        return node == null ? 0 : node.height;
    }

    //get balance factor
    private int getBalance(AVLNode node){
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    //Right Rotate
    private AVLNode rightRotate(AVLNode y){
        AVLNode x = y.left;
        AVLNode T2 = x.right;
     
        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;


        return x;
    }

    // Left rotate
    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        
        y.left = x;
        x.right = T2;
        
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        
        return y;
    }

     // Insert node
    public AVLNode insert(AVLNode node, int val) {
        if (node == null) return new AVLNode(val);
        
        if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        } else {
            return node; // Duplicate keys not allowed
        }
        
        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));
        
        // Get balance factor
        int balance = getBalance(node);
        
        // Left Left Case
        if (balance > 1 && val < node.left.val) {
            return rightRotate(node);
        }
        
        // Right Right Case
        if (balance < -1 && val > node.right.val) {
            return leftRotate(node);
        }
        
        // Left Right Case
        if (balance > 1 && val > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        
        // Right Left Case
        if (balance < -1 && val < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        
        return node;
    }


    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
        
        System.out.println("Root is: " + tree.root.val); // 30 (balanced)
    }
}
