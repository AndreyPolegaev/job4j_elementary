package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] arr = {true, true, true};
        boolean result = Check.mono(arr);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] arr = {true, false, true};
        boolean result = Check.mono(arr);
        assertThat(result, is(false));
    }
}