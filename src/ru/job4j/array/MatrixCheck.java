package ru.job4j.array;
/*
Проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'
Проверить то, что столбец в двухмерном массиве целиком заполнен символом 'X'
Вернуть одномерный массив из эелементов диагонали переданного 2-го массива
Дан массив 5*5. Вернуть true если по вертикали или по горизонтали все Х (сокобан)
 */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] arrayResult = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            arrayResult[i] = board[i][i];
        }
        return arrayResult;

    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
            }
        }
        return result;
    }
}
