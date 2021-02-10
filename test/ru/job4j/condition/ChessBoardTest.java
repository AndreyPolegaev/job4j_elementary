package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int way = ChessBoard.way(6, 7, 1, 2);
        Assert.assertEquals(way, 5);
    }

    @Test
    public void wayIs7() {
        int way = ChessBoard.way(7, 0, 0, 7);
        Assert.assertEquals(way, 7);
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(5, 0, 1, 0);
        Assert.assertEquals(way, 0);
    }

    @Test
    public void wayIsAlso0() {
        int way = ChessBoard.way(2, 6, 4, 1);
        Assert.assertEquals(way, 0);
    }
}