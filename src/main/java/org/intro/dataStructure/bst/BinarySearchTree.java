package org.intro.dataStructure.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Node<Key, Value> root;

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node<Key, Value> put(Node<Key, Value> node, Key key, Value value) {
        if (node == null) {
            return new Node<>(key, value, 1);
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left, key, value);
        } else if (cmp > 0) {
            node.right = put(node.right, key, value);
        } else {
            node.value = value;
        }
        // calculate the size of the BST node
        node.count = 1 + size(node.left) + size(node.right);
        return node;
    }

    private int size(Node<Key, Value> x) {
        if (x == null) return 0;
        return x.count;
    }

    public int size() {
        return size(root);
    }

    public Value get(Key key) {
        Node<Key, Value> node = root;
        while (node != null) {
            int cmp = key.compareTo(node.key);
            if (cmp < 0) {
                node = node.left;
            } else if (cmp > 0) {
                node = node.right;
            } else {
                return node.value;
            }
        }
        return null;
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node<Key, Value> deleteMin(Node<Key, Value> node) {
        if (node.left == null) return node.right;
        node.left = deleteMin(node.left);
        node.count = 1 + size(node.left) + size(node.right);
        return node;
    }

    public void delete(Key key) {
        root = delete(root, key);
    }

    private Node<Key, Value> delete(Node<Key, Value> x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = delete(x.left, key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            if (x.left == null) return x.right;
            if (x.right == null) return x.left;

            Node<Key, Value> t = x;
            x = min(x.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.count = size(x.left) + size(x.right) + 1;
        return x;
    }

    public Iterable<Key> keys() {
        Queue<Key> q = new LinkedList<>();
        inorder(root, q);
        return q;
    }

    private void inorder(Node<Key, Value> x, Queue<Key> q) {
        if (x == null) return;
        inorder(x.left, q);
        q.add(x.key);
        inorder(x.right, q);
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public Key floor(Key key) {
        Node<Key, Value> x = floor(root, key);
        if (x == null) return null;
        return x.key;
    }

    private Node<Key, Value> floor(Node<Key, Value> x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);

        if (cmp == 0) return x;

        if (cmp < 0) return floor(x.left, key);

        Node<Key, Value> t = floor(x.right, key);
        if (t != null) return t;
        return x;
    }

    public int rank(Key key) {
        return rank(root, key);
    }

    private int rank(Node<Key, Value> x, Key key) {
        if (x == null) return 0;
        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            return rank(x.left, key);
        }
        else if (cmp > 0) {
            return 1 + size(x.left) + rank(x.right, key);
        }
        else {
            return size(x.left);
        }
    }

    public Key min() {
        Node<Key, Value> n = min(root);
        return n.key;
    }

    public Node<Key, Value> min(Node<Key, Value> x) {
        if (x == null || x.left == null) return x;
        return min(x.left);
    }

    public Key max() {
        Node<Key, Value> n = max(root);
        return n.key;
    }

    public Node<Key, Value> max(Node<Key, Value> x) {
        if (x == null || x.right == null) return x;
        return max(x.right);
    }
}
