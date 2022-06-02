package binartreestuderende;

public class Opg2 {
    public static void main(String[] args) throws Exception {
        BinaryTree<Integer> tree15 = new BinaryTree<>(15);
        BinaryTree<Integer> tree11 = new BinaryTree<>(11, null, tree15);

        BinaryTree<Integer> tree25 = new BinaryTree<>(25);
        BinaryTree<Integer> tree30 = new BinaryTree<>(30, tree25, null);
        BinaryTree<Integer> tree22 = new BinaryTree<>(22, tree11, tree30);

        BinaryTree<Integer> tree88 = new BinaryTree<>(88);
        BinaryTree<Integer> tree90 = new BinaryTree<>(90, tree88, null);
        BinaryTree<Integer> tree77 = new BinaryTree<>(77, null, tree90);

        BinaryTree<Integer> treeFinal = new BinaryTree<>(45, tree22, tree77);

        System.out.println(treeFinal.size());
        System.out.println("H : " + treeFinal.height());
        System.out.println();

        treeFinal.preorder();
        System.out.println();

        treeFinal.inorder();
        System.out.println();

        treeFinal.postorder();
        System.out.println();

        System.out.println(treeFinal.sum());

    }
}
