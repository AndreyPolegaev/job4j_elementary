package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when21to63Then3point1622() {
        int x2 = 2;
        int x1 = 1;
        int y2 = 6;
        int y1 = 3;
        double expected = 3.16;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void when31to105Then5point3851() {
        int x2 = 3;
        int x1 = 1;
        int y2 = 10;
        int y1 = 5;
        double expected = 5.38;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void when01to01Then1point4142() {
        int x2 = 0;
        int x1 = 1;
        int y2 = 0;
        int y1 = 1;
        double expected = 1.41;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(out, expected, 0.01);
    }
}