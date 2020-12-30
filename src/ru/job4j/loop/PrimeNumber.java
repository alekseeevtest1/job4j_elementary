package ru.job4j.loop;
/**
 В этом задании нужно посчитать количество простых чисел от 1 до finish.

 Например,

 finish = 5, то мы должны проверить числа 2, 3, 4, 5. Простые числа будут 2, 3, 5. Метод вернет 3.
 */

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}