package dataStrcuture.tree;

public class BinaryTreepreOrderTraversal {
    Node root;
    BinaryTreepreOrderTraversal() {
        root = null;
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printInorder(node.left);
        printInorder(node.right);
    }
    void printInorder() { printInorder(root); }

    public static void main(String[] args)
    {
        BinaryTreepreOrderTraversal tree = new BinaryTreepreOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function call
        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printInorder();
    }

}
