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

    /**
     *  data - массив чисел,
     *
     *     el - элемент, который нужно найти,
     *
     *     start - индекс, с которого начинаем поиск,
     *
     *     finish - индекс, которым заканчиваем поиск.
     *
     *     {5, 2, 10, 2, 4}
     */
    public static int indexOf(int[] data, int el, int start, int finish) {

        for (; start <= finish ; start++){
            if (data[start] == el){
                return start;

            }
        }

        /* если элемента нет в массиве, то возвращаем -1. */
        return -1;
    }
}
