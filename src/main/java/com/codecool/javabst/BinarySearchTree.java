package com.codecool.javabst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Skeleton for the Binary search tree. Feel free to modify this class.
public class BinarySearchTree {
    private Node root;
    private List<Node> nodes = new ArrayList<>();
    public List<Integer> elements;

    public BinarySearchTree(List<Integer> elements) {
        this.elements = elements;
        buildTree();
    }

    private void buildTree() {
        // TODO construct a binary search tree here
        root = new Node(elements);
        nodes.add(root);
        List<Node> currentNodes = new ArrayList<>(Arrays.asList(root));
        List<Node> nextNodes = new ArrayList<>();
        while (!currentNodes.isEmpty()) {
            for (Node node : currentNodes) {
                if (!node.getLeftChildNumbers().isEmpty()) {
                    Node leftChild = new Node(node.getLeftChildNumbers());
                    node.setLeftChild(leftChild);
                    nextNodes.add(leftChild);
                    this.nodes.add(leftChild);
                }
                if (!node.getRightChildNumbers().isEmpty()) {
                    Node rightChild = new Node(node.getRightChildNumbers());
                    node.setRightChild(rightChild);
                    nextNodes.add(rightChild);
                    this.nodes.add(rightChild);
                }
            }
            currentNodes.clear();
            currentNodes.addAll(nextNodes);
            nextNodes.clear();
        }
    }


    public boolean search(Integer toFind) {
        // TODO return true if the element has been found, false if its not in the tree.
        Node actualNode = root;
        while (!actualNode.getNodeValue().equals(toFind)) {
            if (actualNode.getNodeValue().equals(toFind)) {
                return true;
            }
            if (toFind < actualNode.getNodeValue()) {
                if (actualNode.getLeftChild() == null) {
                    return false;
                }
                actualNode = actualNode.getLeftChild();


            } else if (toFind > actualNode.getNodeValue()) {
                if (actualNode.getRightChild() == null) {
                    return false;
                }
                actualNode = actualNode.getRightChild();
            }

        }
        return true;
    }


    public void add(Integer toAdd) throws Exception {
        // TODO adds an element. Throws an error if it exist.
        if (!this.search(toAdd)) {
            elements.add(toAdd);
            Collections.sort(elements);
            nodes.clear();
            this.buildTree();
        } else {
            throw new IntegerAlreadyInListException("Integer already in list!");
        }
    }

    public void remove(Integer toRemove) throws IntegerNotInListException {
        // TODO removes an element. Throws an error if its not on the tree.
        if (this.search(toRemove)) {
            elements.remove(toRemove);
            nodes.clear();
            this.buildTree();
        } else {
            throw new IntegerNotInListException("Integer not in list, cannot be removed!");
        }
    }

    class IntegerAlreadyInListException extends Exception {
        public IntegerAlreadyInListException(String message) {
            super(message);
        }
    }

    class IntegerNotInListException extends Throwable {
        public IntegerNotInListException(String message) {
            super(message);
        }
    }
}
