package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 5, 2);
        Assert.assertEquals(result, 10);
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 1, 20);
        Assert.assertEquals(result, 20);
    }

    @Test
    public void whenFiguresIsEquals() {
        int result = MultiMax.max(1, 1, 1);
        Assert.assertEquals(result, 1);
    }
}