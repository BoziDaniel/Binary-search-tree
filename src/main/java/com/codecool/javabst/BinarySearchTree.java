package com.codecool.javabst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Skeleton for the Binary search tree. Feel free to modify this class.
public class BinarySearchTree {
    private Node root;
    private List<Node> nodes = new ArrayList<>();
    private List<Integer> elements;

    public BinarySearchTree(List<Integer> elements) {
        // TODO construct a binary search tree here
        this.elements = elements;
        root = new Node(elements);
        nodes.add(root);
        System.out.println(elements);
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
        System.out.println("nodes: " + this.nodes);
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



    public void add(Integer toAdd) {
        // TODO adds an element. Throws an error if it exist.

    }

    public void remove(Integer toRemove) {
        // TODO removes an element. Throws an error if its not on the tree.
    }

}
