package org.intro.praticeQuestions.grahamscan;

import java.util.Stack;

public class ConvexHullVisualization {

    private final Point2D[] points;

    public ConvexHullVisualization(Point2D[] points) {
        this.points = points;
    }

    public void visualize() {

        ConvexHull convexHull = new ConvexHull();
        Stack<Point2D> result = convexHull.convexHull(points);

        String[] str = new String[result.size()];
        int i = 0;
        while (!result.isEmpty()) {
            Point2D p = result.pop();
            str[i] = p.getX() + "," + p.getY();
            i++;
        }

        ShapeDrawing.main(str);
    }
}
