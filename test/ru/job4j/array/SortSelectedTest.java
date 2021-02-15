package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortThreeFigures() {
        int[] array = new int[] {0, 7, -5};
        int[] expected = new int[] {-5, 0, 7};
        int[] out = SortSelected.sort(array);
        assertThat(out, is(expected));
    }

    @Test
    public void whenSortFiveFigures() {
        int[] array = new int[] {3, 4, 1, 2, 5};
        int[] expected = new int[] {1, 2, 3, 4, 5};
        int[] out = SortSelected.sort(array);
        assertThat(out, is(expected));
    }
}