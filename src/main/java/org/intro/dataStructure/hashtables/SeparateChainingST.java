package org.intro.dataStructure.hashtables;

public class SeparateChainingST<Key, Value> {
    private static final int M = 97;
    private Node[] st = new Node[M];

    static class Node {
        private final Object key;
        private Object value;
        private final Node next;

        public Node(Object key, Object value, Node node) {
            this.key = key;
            this.value = value;
            this.next = node;
        }
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public Value get(Key key) {
        int i = hash(key);
        for (Node x = st[i]; x != null; x = x.next) {
            if (key.equals(x.key)) {
                return (Value) x.value;
            }
        }
        return null;
    }

    public void put(Key key, Value value) {
        int i = hash(key);
        for (Node x = st[i]; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.value = value;
            }
        }
        st[i] = new Node(key, value, st[i]);
    }
}
