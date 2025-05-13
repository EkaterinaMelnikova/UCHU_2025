package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

public class PointTests {


    @Test
    public void testDistance(){

        Point p1 = new Point(5.0, 7.0);
        Point p2 = new Point(5.0, 8.0);
        assert Point.distance(p2, p1)== 1;

    }
}
