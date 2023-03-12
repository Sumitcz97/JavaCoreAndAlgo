package dataStrcuture.tree;

//Basic Tree Structure having three nodes : 1 Root 2 Child

public class BinaryTreeBasicStrcuture {
    Node root;
    public static void main(String[] args){
        BinaryTreeBasicStrcuture newBt=new BinaryTreeBasicStrcuture();
        newBt.root=new Node(6);
        newBt.root.left=new Node(7);
        newBt.root.right=new Node(8);

        System.out.println(newBt.root.left.data);
    }
}
