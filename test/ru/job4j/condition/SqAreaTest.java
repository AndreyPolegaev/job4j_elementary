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
}