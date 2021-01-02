package com.sample.tree.binaryTree;

/**
 * refer to https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 *
 */
public class BinaryTree {

  private Node root;

  public void printPostorder(Node node) {
    if (node == null) {
      return;
    }

    printPostorder(node.getLeft());
    printPostorder(node.getRight());
    System.out.println(node.getValue() + " ");
  }

  public void printPreorder(Node node) {
    if (node == null) {
      return;
    }

    System.out.println(node.getValue() + " ");
    printPreorder(node.getLeft());
    printPreorder(node.getRight());
  }

  public void printInorder(Node node) {
    if (node == null) {
      return;
    }

    printInorder(node.getLeft());
    System.out.println(node.getValue() + " ");
    printInorder(node.getRight());
  }

  public void printPostorder() {
    printPostorder(root);
  }

  public void printInorder() {
    printInorder(root);
  }

  public void printPreorder() {
    printPreorder(root);
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.setLeft(new Node(2));
    tree.root.setRight(new Node(3));
    tree.root.getLeft().setLeft(new Node(4));
    tree.root.getLeft().setRight(new Node(5));

    System.out.println("Print the tree in postorder:");
    tree.printPostorder();

    System.out.println("Print the tree in preorder:");
    tree.printPreorder();

    System.out.println("Print the tree in inorder:");
    tree.printInorder();
  }
}
