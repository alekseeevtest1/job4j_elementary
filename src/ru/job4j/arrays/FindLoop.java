package ru.job4j.arrays;

public class FindLoop {
    public static int indexOf(int[] data, int el){
        int res = -1;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == el){
                res = i;
                break;
            }

        }
        return res;
    }
}
