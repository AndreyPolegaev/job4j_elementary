package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean rsl = ArrayChar.startsWith(word, pref);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean rsl = ArrayChar.startsWith(word, pref);
        assertThat(rsl, is(false));
    }
}