package org.intro.praticeQuestions.grahamscan;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeDrawing extends JPanel {

    // List of points to draw the shape
    private List<Point> points;

    // Constructor to initialize the points
    public ShapeDrawing(List<Point> points) {
        this.points = points;
    }

    // Override the paintComponent method to draw the shape
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for better graphics quality
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the points
        g2d.setColor(Color.RED);
        for (Point p : points) {
            g2d.fillOval(p.x - 3, p.y - 3, 6, 6); // Draw small circles at the points
        }

        // Draw the shape (polygon)
        g2d.setColor(Color.BLUE);
        Polygon polygon = new Polygon();
        for (Point p : points) {
            polygon.addPoint(p.x, p.y); // Add points to the polygon
        }
        g2d.drawPolygon(polygon); // Draw the polygon outline
    }

    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide a list of points in the format x1,y1 x2,y2 ...");
            return;
        }

        // List to hold the points extracted from args
        List<Point> points = new ArrayList<>();

        // Process each argument and extract points
        for (String arg : args) {
            try {
                String[] coords = arg.split(","); // Split the argument by comma
                if (coords.length == 2) {
                    double x = Double.parseDouble(coords[0].trim());
                    double y = Double.parseDouble(coords[1].trim());
                    Point p = new Point();
                    p.setLocation(x, y);
                    points.add(p);
                } else {
                    System.out.println("Invalid point format: " + arg);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + arg);
            }
        }

        // Make sure GUI components are created on the EDT
        SwingUtilities.invokeLater(() -> {
            // Create a frame to hold the panel
            JFrame frame = new JFrame("Shape Drawing");

            // Create an instance of the ShapeDrawing class and add it to the frame
            ShapeDrawing panel = new ShapeDrawing(points);
            frame.add(panel);

            // Set up the frame
            frame.setSize(1000, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}