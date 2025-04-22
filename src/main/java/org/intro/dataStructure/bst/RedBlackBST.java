package org.intro.dataStructure.bst;

public class RedBlackBST<Key extends Comparable<Key>, Value> {

    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private Node root;

    class Node {
        private final Key key;
        private Value value;
        private Node left;
        private Node right;

        private boolean color;

        private Node(Key k, Value v, boolean c) {
            this.key = k;
            this.value = v;
            this.color = c;
        }
    }

    public void put(Key k, Value v) {
        root = put(root, k, v);
    }

    private Node put(Node h, Key k, Value v) {
        if (h == null)
            return new Node(k, v, RED);
        int cmp = k.compareTo(h.key);
        if (cmp < 0) {
            h.left = put(h.left, k, v);
        } else if (cmp > 0) {
            h.right = put(h.right, k, v);
        } else {
            h.value = v;
        }

        if (isRed(h.right) && !isRed(h.left)) {
            h = rotateLeft(h);
        }
        if (isRed(h.left) && isRed(h.left.left)) {
            h = rotateRight(h);
        }
        if (isRed(h.left) && isRed(h.right)) {
            flipColor(h);
        }
        return h;
    }

    public Value get(Key key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else {
                return x.value;
            }
        }
        return null;
    }

    private boolean isRed(Node x) {
        if (x == null) return false;
        return x.color == RED;
    }

    private Node rotateLeft(Node h) {
        assert isRed(h.right);
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {
        assert isRed(h.left);
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColor(Node h) {
        assert !isRed(h);
        assert isRed(h.left);
        assert isRed(h.right);

        h.left.color = BLACK;
        h.right.color = BLACK;
        h.color = RED;
    }
}
