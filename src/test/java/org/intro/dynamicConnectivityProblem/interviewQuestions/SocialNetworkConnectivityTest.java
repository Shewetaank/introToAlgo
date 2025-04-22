package org.intro.dynamicConnectivityProblem.interviewQuestions;

import org.junit.Test;

public class SocialNetworkConnectivityTest {

    @Test
    public void testSocialNetworkConnectivity() {
        var quickUnion = new SocialNetworkConnectivity(10);
        quickUnion.union(0, 1, "2023-12-19 19:20");
        quickUnion.union(1, 2, "2023-12-19 19:21");
        quickUnion.union(3, 4, "2023-12-19 19:25");
        quickUnion.union(2, 4, "2023-12-19 19:28");
        quickUnion.union(2, 4, "2023-12-19 19:28");
        quickUnion.union(6, 7, "2023-12-19 19:28");
        quickUnion.union(7, 8, "2023-12-19 19:29");
        quickUnion.union(6, 9, "2023-12-19 19:30");
        quickUnion.union(2, 5, "2023-12-19 19:35");
        quickUnion.union(1, 6, "2023-12-19 19:40");
    }
}
