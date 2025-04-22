package org.intro.dataStructure.hashtables;

public class LinearProbingHT<Key, Value> {

    private int M = 1000;
    private Key[] keys;
    private Value[] values;

    public LinearProbingHT() {
        keys = (Key[]) new Object[M];
        values = (Value[]) new Object[M];
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void insert(Key key, Value value) {
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % M) {
            if (keys[i].equals(key)) {
                break;
            }
        }
        keys[i] = key;
        values[i] = value;
    }

    public Value get(Key key) {
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % M) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }
}
