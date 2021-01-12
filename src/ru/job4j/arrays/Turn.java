package ru.job4j.arrays;

// Массив {1, 2, 3, 4, 5} после переворота должен стать {5, 4, 3, 2, 1}
public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++ ){
            int temp;
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;


        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        back(array);
        for (int i = 0; i < back(array).length; i++){
            System.out.println(back(array)[i]);
        }
    }
}