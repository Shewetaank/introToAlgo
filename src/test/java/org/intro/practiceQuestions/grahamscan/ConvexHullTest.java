package org.intro.practiceQuestions.grahamscan;

import org.intro.praticeQuestions.grahamscan.ConvexHullVisualization;
import org.intro.praticeQuestions.grahamscan.Point2D;

public class ConvexHullTest {

    public static void main(String[] args) {
        Point2D[] points = {
                new Point2D(100, 200),
                new Point2D(200, 500),
                new Point2D(300, 100),
                new Point2D(500,  300),
                new Point2D(600, 400),
                new Point2D(700, 200),
                new Point2D(800, 600),
                new Point2D(400, 700),
        };

        ConvexHullVisualization visualization = new ConvexHullVisualization(points);
        visualization.visualize();
    }
}
