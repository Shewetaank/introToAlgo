package org.intro.praticeQuestions.grahamscan;

import java.util.Arrays;
import java.util.Stack;

public class ConvexHull {

    public Stack<Point2D> convexHull(Point2D[] points) {
        // TODO: sort the array by lowest y coordinate
        MergeSort.sort(points, Point2D.BY_Y_COORDINATE);
        // TODO: sort by the polar angle with respect to points[0]
        Arrays.sort(points, points[0].POLAR_ORDER);

        Stack<Point2D> hull = new Stack<>();
        hull.push(points[0]);
        hull.push(points[1]);

        // convex hull algo
        for (int i = 2; i < points.length; i++) {
            Point2D top = hull.pop();
            while (Point2D.ccw(hull.peek(), top, points[i]) <= 0) {
                top = hull.pop();
            }
            hull.push(top);
            hull.push(points[i]);
        }

        return hull;
    }
}
