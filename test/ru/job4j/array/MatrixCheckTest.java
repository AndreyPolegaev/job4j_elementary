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

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean expected = MatrixCheck.monoVertical(input, 2);
        assertThat(expected, is(true));

    }

    @Test
    public void whenHasMonoVerticalFourRow() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '}
        };
        boolean expected = MatrixCheck.monoVertical(input, 1);
        assertThat(expected, is(true));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] expected = {'X', 'X', 'X'};
        char[] rsl = MatrixCheck.extractDiagonal(input);
        assertThat(expected, is(rsl));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
}