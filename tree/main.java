package tree;
public class main {
    public static void main(String[] args) {
        RedBlackTree node = new RedBlackTree();

        node.insert(45);
        node.inorder();
        System.out.println("\n");
        node.insert(22);
        node.inorder();
        System.out.println("\n");
        node.insert(10);
        node.inorder();
        System.out.println("\n");
        node.insert(-23);
        node.inorder();
        System.out.println("\n");
        node.insert(-1);
        node.inorder();
        System.out.println("\n");
        node.insert(-11);
        node.inorder();
        System.out.println("\n");
        node.insert(45);
        node.inorder();
        System.out.println("\n");
        node.insert(-4454545);
        node.inorder();


    }
    
}
