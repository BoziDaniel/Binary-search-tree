package com.codecool.javabst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Skeleton for the Binary search tree. Feel free to modify this class.
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(List<Integer> elements) {
        // TODO construct a binary search tree here
        root = new Node(elements);
        System.out.println(elements);
        List<Node> nodes = new ArrayList<>(Arrays.asList(root));
        List<Node> currentNodes = new ArrayList<>(Arrays.asList(root));
        List<Node> nextNodes = new ArrayList<>();
        while (!currentNodes.isEmpty()) {
            for (Node node : currentNodes) {
                if (!node.getLeftChildNumbers().isEmpty() ) {
                    Node leftChild = new Node(node.getLeftChildNumbers());
                    node.setLeftChild(leftChild);
                    nextNodes.add(leftChild);
                    nodes.add(leftChild);
                }
                if (!node.getRightChildNumbers().isEmpty() ) {
                    Node rightChild = new Node(node.getRightChildNumbers());
                    node.setRightChild(rightChild);
                    nextNodes.add(rightChild);
                    nodes.add(rightChild);
                }
            }
            currentNodes.clear();
            currentNodes.addAll(nextNodes);
            nextNodes.clear();
        }
        System.out.println("nodes: "+  nodes);
    }


    private List<Node> nodes;

    public boolean search(Integer toFind) {
        // TODO return true if the element has been found, false if its not in the tree.
        return false;
    }

    public void add(Integer toAdd) {
        // TODO adds an element. Throws an error if it exist.
    }

    public void remove(Integer toRemove) {
        // TODO removes an element. Throws an error if its not on the tree.
    }

}
