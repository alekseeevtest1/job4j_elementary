package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int res = first;
        if (second >= first && second >= third) {
            res = second;
        }
        if (third >= first && third >= second) {
            res = third;
        }
        return res;
    }
}
