package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static ru.job4j.array.EqLast.check;

public class EqLastTest {

    @Test
    public void whenEq() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        assertThat(check(arr1, arr2), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        assertThat(check(arr1, arr2), is(false));
    }

    @Test
    public void whenNotEq2() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 3, 4};
        assertThat(check(arr1, arr2), is(false));
    }
}