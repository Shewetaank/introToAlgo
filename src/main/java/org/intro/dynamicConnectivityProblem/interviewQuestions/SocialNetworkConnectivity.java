package org.intro.dynamicConnectivityProblem.interviewQuestions;

public class SocialNetworkConnectivity {

    private final int[] id;
    private final int[] sz;
    private final int N;

    public SocialNetworkConnectivity(int n) {
        N = n;
        id = new int[n];
        sz = new int[n];
        for(int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public void union(int p, int q, String timeStamp) {
        int i = root(p);
        int j = root(q);
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
            if (sz[j] == N) {
                System.out.println("All members are connected at " + timeStamp);
            }
        } else {
            id[j] = i;
            sz[i] += sz[j];
            if (sz[i] == N) {
                System.out.println("All members are connected at " + timeStamp);
            }
        }
    }
}
