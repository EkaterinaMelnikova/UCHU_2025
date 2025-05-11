package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;
    public static double d;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    static double distance(Point p1, Point p2) {

        double d = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
        return d;
    }

}


class PointTest {


    public static void main(String[] args) {

        Point p1 = new Point(5.0, 7.0);
        Point p2 = new Point(5.0, 8.0);

        System.out.println("Расстояние между точками  = " + Point.distance(p2, p1));

    }
}

