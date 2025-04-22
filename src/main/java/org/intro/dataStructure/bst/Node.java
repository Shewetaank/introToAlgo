package org.intro.dataStructure.bst;

public class Node<Key extends Comparable<Key>, Value> {

    public final Key key;
    public Value value;
    public Node<Key, Value> left;
    public Node<Key, Value> right;
    public int count;
    public Node(Key key, Value value, int count) {
        this.key = key;
        this.value = value;
        this.count = count;
    }

}
