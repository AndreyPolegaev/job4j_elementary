package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int in = 1;
        int in2 = 2;
        int expected = 2;
        int out = Max.max(in, in2);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenMax25To10Then25() {
        int in = 25;
        int in2 = 10;
        int expected = 25;
        int out = Max.max(in, in2);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenMax10To10Then10() {
        int in = 10;
        int in2 = 10;
        int expected = 10;
        int out = Max.max(in, in2);
        Assert.assertEquals(expected, out);
    }
}