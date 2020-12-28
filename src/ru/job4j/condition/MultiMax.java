package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second){
            result = first;
        }else if (second > first){
            result = second;
        }
        if (result > third){
            return result;
        }else {
            return third;
        }


    }
}
