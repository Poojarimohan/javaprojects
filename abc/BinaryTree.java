package abc;

class Node {
    String data;
    Node left, right;

    public Node(String value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree {
	Node root;
	public void insert() {
        root = new Node("mom");
        root.left = new Node("dad");
        root.right = new Node("you");

    }
	 public void printChildren(Node node) {
	        if (node != null) {
	            System.out.println("Root Node: " + node.data);

	            if (node.left != null)
	                System.out.println("  Left Child: " + node.left.data);
	            

	            if (node.right != null)
	                System.out.println("  Right Child: " + node.right.data);
	            

	            //printChildren(node.left);
	            //printChildren(node.right);
	        }
	    }
	 public void inorder(Node node) {
	        if (node != null) {
	            inorder(node.left);
	            System.out.print(node.data + " ");
	            inorder(node.right);
	        }
	    }
	
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.insert();
		tree.printChildren(tree.root);
		tree.inorder(tree.root);
	}

}
