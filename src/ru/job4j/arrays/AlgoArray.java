package ru.job4j.arrays;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp; /* переменная для временного хранения значение ячейки с индексом 0. */
        boolean sorted = false;
        while (!sorted) {


            for (int index = 1; index < array.length; index++) {
                if (array[index - 1] > array[index]) {
                    temp = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = temp;
                    sorted = true;

                }


            }
        }
    }
}