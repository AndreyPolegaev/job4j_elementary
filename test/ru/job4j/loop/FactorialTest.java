package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rsl = Factorial.calc(5);
        Assert.assertThat(rsl, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        Assert.assertThat(rsl, is(1));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int rsl = Factorial.calc(1);
        Assert.assertThat(rsl, is(1));
    }
}