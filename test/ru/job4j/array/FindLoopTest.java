package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then1() {
        int[] arr = new int[] {0, 5, 1, 2, -8};
        int value = 5;
        int result = FindLoop.indexOf(arr, value);
        assertThat(result, is(1));

    }

    @Test
    public void when10ThenDoesntFindMinus1() {
        int[] arr = new int[] {0, 5, 1, 2, -8};
        int result = FindLoop.indexOf(arr, 10);
        assertThat(result, is(-1));
    }
}