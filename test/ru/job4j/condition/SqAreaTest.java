package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class SqAreaTest {
    @Test
    public void whenp6k2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenp4k1s1() {
        int k = 1;
        int p = 4;
        double expected = 1.0;
        double s = SqArea.square(p, k);
        Assert.assertEquals(s, expected, 0.01);
    }

}