package binartreestuderende;

import java.util.NoSuchElementException;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData
	 *            the data for the root
	 */
	public BinaryTree(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 *
	 * @param rootData
	 *            the data for the root
	 * @param left
	 *            the left subtree
	 * @param right
	 *            the right subtree
	 */
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 *
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 *
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 *
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.right;
		return result;
	}

	/**
	 *
	 * @param rootData
	 *            the new data for the root
	 *
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		E data = root.data;
		root.data = rootData;
		return data;
	}

	/**
	 *
	 * @param n
	 * @return true in n has no children
	 */
	private boolean isLeaf(Node n) {
		return n.left == null && n.right == null;
	}

	/**
	 *
	 * @param n
	 * @return true in n has at least one child
	 */
	private boolean isInternal(Node n) {
		return n.left != null || n.right != null;
	}

	/**
	 *
	 * @return the number of nodes in the tree
	 */
	public int size() {
		if(root == null) throw new NoSuchElementException("No root in this tree");
		return size(root);
	}

	private int size(Node n) {
		int leftSize = n.left != null ? size(n.left) : 0;
		int rightSize = n.right != null ? size(n.right) : 0;
		return leftSize + rightSize + 1;
	}

	/**
	 *
	 * @return the number of nodes in longest path
	 */
	public int height() {
		return height(root);
	}

	private int height(Node n) {
		int leftSize = n.left != null ? height(n.left) : 0;
		int rightSize = n.right != null ? height(n.right) : 0;
		if(leftSize < rightSize) return rightSize + 1;
		return leftSize + 1;
	}

	/**
	 * Preorder
	 */
	public void preorder() {
		preorder(root);
	}

	private void preorder(Node n) {
		System.out.println(n.data);
		if(n.left != null) preorder(n.left);
		if(n.right != null) preorder(n.right);
	}

	/**
	 * inorder
	 */
	public void inorder() {
		inorder(root);
	}

	private void inorder(Node n) {
		if(n.left != null) inorder(n.left);
		System.out.println(n.data);
		if(n.right != null) inorder(n.right);
	}

	/**
	 * inorder
	 */
	public void postorder() {
		postorder(root);
	}

	private void postorder(Node n) {
		if(n.left != null) postorder(n.left);
		if(n.right != null) postorder(n.right);
		System.out.println(n.data);
	}

	public int sum() throws Exception {
		return sum(root);
	}

	private int sum(Node n) throws Exception {
		int leftSum = n.left != null ? sum(n.left) : 0;
		int rightSum = n.right != null ? sum(n.right) : 0;
		if(n.data instanceof Integer) {
			return leftSum + rightSum + (int) n.data;
		}
		throw new Exception("må kun bruges hvis datatypen er Integer");
	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
