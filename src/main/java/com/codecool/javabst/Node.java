package com.codecool.javabst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node {
    private Integer nodeValue= null;
    private List<Integer> leftChildNumbers = new ArrayList<>();
    private List<Integer> rightChildNumbers = new ArrayList<>();
    private Node leftChild = null;
    private Node rightChild= null;

    public Node(List<Integer> elements) {
        if (elements.size() == 1) {
            nodeValue = elements.get(0);
        } else {
            int middleElementIndex = getMiddleElementIndex(elements);
            this.nodeValue = elements.get(middleElementIndex);
            this.leftChildNumbers = elements.subList(0, middleElementIndex);
            this.rightChildNumbers = elements.subList(middleElementIndex + 1, elements.size());
        }
    }


    private Integer getMiddleElementIndex(List<Integer> elements) {
        int numOfElements = elements.size();
        return (numOfElements % 2 == 0) ? numOfElements / 2 - 1 : numOfElements / 2;
    }

    public List<Integer> getLeftChildNumbers() {
        return leftChildNumbers;
    }

    public void setLeftChildNumbers(List<Integer> leftChildNumbers) {
        this.leftChildNumbers = leftChildNumbers;
    }

    public List<Integer> getRightChildNumbers() {
        return rightChildNumbers;
    }

    public void setRightChildNumbers(List<Integer> rightChildNumbers) {
        this.rightChildNumbers = rightChildNumbers;
    }

    public Integer getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(Integer nodeValue) {
        this.nodeValue = nodeValue;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        Integer left = (this.leftChild != null) ? this.leftChild.getNodeValue() : null;
        Integer right = (this.rightChild != null) ? this.rightChild.getNodeValue() : null;

        return "Node{" +
                "nodeValue=" + nodeValue +
//                ", leftChildNumbers=" + leftChildNumbers +
//                ", rightChildNumbers=" + rightChildNumbers +
                ", leftChild=" + left +
                ", rightChild=" + right +
                '}';
    }
}