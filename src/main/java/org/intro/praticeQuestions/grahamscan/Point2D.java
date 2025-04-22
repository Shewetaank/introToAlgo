package org.intro.praticeQuestions.grahamscan;

import java.util.Comparator;

public class Point2D {

    public static final Comparator<Point2D> BY_Y_COORDINATE = new ByYCoordinate();
    public final Comparator<Point2D> POLAR_ORDER = new PolarOrder();
    private final double x;
    private final double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static int ccw(Point2D a, Point2D b, Point2D c) {
        double area = (b.x-a.x)*(c.y-a.y) - (b.y-a.y)*(c.x-a.x);
        if (area < 0) return -1;
        else if (area > 0) return +1;
        else return 0;
    }

    private static class ByYCoordinate implements Comparator<Point2D> {

        @Override
        public int compare(Point2D o1, Point2D o2) {
            return Double.compare(o1.y, o2.y);
        }
    }

    private class PolarOrder implements Comparator<Point2D> {

        @Override
        public int compare(Point2D o1, Point2D o2) {
            double dy1 = o1.y - y;
            double dy2 = o2.y - y;

            if (dy1 >= 0 && dy2 < 0) {
                return -1;
            } else if (dy2 >= 0 && dy1 < 0) {
                return 1;
            } else {
                return -ccw(Point2D.this, o1, o2);
            }
        }
    }
}
