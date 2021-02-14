package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class TurnTest {

    @Test
    public void whenArrayHasThreeElementsThenReverse() {
        int[] arr = {1, 2, 3};
        int[] expected = {3, 2, 1};
        int[] rsl = Turn.back(arr);
        assertThat(expected, is(rsl));
    }

    @Test
    public void henArrayHasFourElementsThenReverse() {
        int[] arr = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        int[] rsl = Turn.back(arr);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenArrayHasFiveElementsThenReverse() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(arr);
        assertThat(rsl, is(expected));
    }

    @Test
    public void henArrayHasTenElementsThenReverse() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] rsl = Turn.back(arr);
        assertThat(rsl, is(expected));
    }
}