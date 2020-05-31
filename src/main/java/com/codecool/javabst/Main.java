package com.codecool.javabst;

import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception, BinarySearchTree.IntegerNotInListException {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2 + 5);
        }

        BinarySearchTree myTree = new BinarySearchTree(numbers);

        // write some test code here
        System.out.println(myTree.search(7)); // should be true
//        System.out.println(myTree.search(55)); // should be true
//        System.out.println(myTree.search(34535)); // should be false
        System.out.println("size: " + myTree.elements.size());
        myTree.add(3);
        System.out.println(myTree.elements + " 3 added");
        System.out.println("size: " + myTree.elements.size());
        myTree.remove(3);
        System.out.println(myTree.elements + " 3 removed");
        System.out.println("size: " + myTree.elements.size());
//        myTree.add(7);
//        System.out.println("size: " + myTree.elements.size());

//        myTree.remove(2);
//        System.out.println("size: " + myTree.elements.size());


        System.out.println("done");
    }
}