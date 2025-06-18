package materia.controller;

import materia.model.*;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node padre, int value) {
        if (padre == null) {
            return new Node(value);
        }
        if (value < padre.getValue()) {
            padre.setLeft(insertRec(padre.getLeft(), value));
        } else if (value > padre.getValue()) {
            padre.setRight(insertRec(padre.getRight(), value));
        }
        return padre;
    }

    public void printPreOrder() {
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            printPreOrder(node.getLeft());
            printPreOrder(node.getRight());
        }
    }

    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            printInOrder(node.getRight());
        }
    }

    public void printPostOrder() {
        printPostOrder(root);
        System.out.println();
    }

    private void printPostOrder(Node node) {
        if (node != null) {
            printPostOrder(node.getLeft());
            printPostOrder(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }
}