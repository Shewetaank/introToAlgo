package org.intro.search;

public class BinarySearch {

    private final int[] id;
    public BinarySearch(int[] id) {
        this.id = id;
    }

    public int search(int key) {
        int low = 0;
        int high = id.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (key < id[mid]) {
                high = mid - 1;
            } else if (key > id[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
