package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
//import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rsl = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rsl = Square.calculate(5);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(rsl, is(expected));
    }
}