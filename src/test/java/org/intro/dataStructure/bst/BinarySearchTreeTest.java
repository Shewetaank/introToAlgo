package org.intro.dataStructure.bst;

import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void bTest() {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(9, "nine");
        bst.put(10, "ten");
        bst.put(8, "eight");
        bst.put(11, "eleven");
        bst.put(13, "thirteen");
        bst.put(6, "six");
        bst.put(7, "seven");
        bst.put(4, "four");
        bst.put(14, "fourteen");
        bst.put(12, "twelve");

        // search a key
        System.out.println("search a key");
        System.out.println(bst.get(6));
        System.out.println(bst.get(20));

        // check if key exists
        System.out.println("key exists");
        System.out.println(bst.contains(4));
        System.out.println(bst.contains(40));
        // min
        System.out.println("min key");
        System.out.println(bst.min());
        // rank
        System.out.println("rank of a key");
        System.out.println(bst.rank(10));
        System.out.println(bst.rank(9));
        // iterate
        System.out.println("iterate over keys");
        var keys = bst.keys();
        for (var key : keys) {
            System.out.println(key + " " + bst.get(key));
        }
        // floor
        System.out.println("floor");
        System.out.println(bst.floor(15));
        System.out.println(bst.floor(3));
    }

    @Test
    public void validTree() {
        BinarySearchTree<Integer, Integer> bst = new BinarySearchTree<>();
        bst.put(10, 10);
        bst.put(9, 19);
        bst.put(12, 12);


    }
}
