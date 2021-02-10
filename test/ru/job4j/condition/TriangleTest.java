package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean out = Triangle.exist(2.0, 2.0, 2.0);
        Assert.assertEquals(out, true);
    }

    @Test
    public void whenDoesNotExist() {
        boolean out = Triangle.exist(0.0, 2.0, 2.0);
        Assert.assertEquals(out, false);
    }
}