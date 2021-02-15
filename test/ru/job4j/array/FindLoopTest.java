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

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        assertThat(result, is(3));
    }

    @Test
    public void whenDoesNotFind2() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 5;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        assertThat(result, is(-1));
    }
}