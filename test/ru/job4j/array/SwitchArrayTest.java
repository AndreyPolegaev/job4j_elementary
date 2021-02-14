package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void when0to3() {
        int[] arr = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(arr, 0, 3);
        assertThat(expect, is(rsl));
    }

    @Test
    public void when1to2() {
        int[] arr = {3, 4, 5, 6};
        int[] expected = {3, 5, 4, 6};
        int[] rsl = SwitchArray.swap(arr, 1, 2);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenFirstToLast() {
        int[] arr = {0, -3, 2, 1, 20};
        int[] expected = {20, -3, 2, 1, 0};
        int[] rsl = SwitchArray.swap(arr, 0, arr.length - 1);
        assertThat(expected, is(rsl));
    }
}