package ru.job4j.condition;

/**
 * 1. Вам необходимо реализовать метод way для фигуры слон. Напомню, что эта фигура двигается только по диагонали.
 *
 * 2. Очень важно - прежде чем вычислять количество ходов, нужно проверить ходит ли фигура по переданным координатам по диагонали.
 * Фигура ходит по диагонали только в том случае, если координаты x и y изменяются в процессе движения одинаково.
 * Если это условие не выполняется, то метод должен вернуть 0.
 */
public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int a = Math.abs(x1 - x2);
        int b = Math.abs(y1 - y2);
        int res = 0;
        if(a == b) {
            return res = a;
        }


        return res;
    }
}