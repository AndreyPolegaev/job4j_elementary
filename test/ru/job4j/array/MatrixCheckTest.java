package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenXinTheFirstRow() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        boolean expected = MatrixCheck.monoHorizontal(input, 0);
        assertThat(expected, is(true));

    }

    @Test
    public void whenXinTheSecondRow() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean expected = MatrixCheck.monoHorizontal(input, 1);
        assertThat(expected, is(true));

    }

    @Test
    public void whenXinTheLastRow() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X'}
        };
        boolean expected = MatrixCheck.monoHorizontal(input, 2);
        assertThat(expected, is(true));

    }

    @Test
    public void whenXinTheFirstRowIsAbsent() {
        char[][] input = {
                {'X', 'X', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        boolean expected = MatrixCheck.monoHorizontal(input, 0);
        assertThat(expected, is(false));

    }

    @Test
    public void whenFourElementsXinTheFirstRow() {
        char[][] input = {
                {'X', 'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        boolean expected = MatrixCheck.monoHorizontal(input, 0);
        assertThat(expected, is(true));

    }
}