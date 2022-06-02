package serialisering;

public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(45);
        tree.add(22);
        tree.add(11);
        tree.add(15);
        tree.add(30);
        tree.add(25);
        tree.add(77);
        tree.add(90);
        tree.add(88);

        //Storage.addTree(tree);

        BinarySearchTree<Integer> returnTree = Storage.getTree();

        returnTree.print();
    }
}
