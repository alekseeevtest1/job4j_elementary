package ru.job4j.loop;

/**
 * 1. В классе Counter нужно добавить метод public static int sumByEven(int start, int finish)
 * 2. Метод должен вычислять сумму четныx чисел в диапазоне от start до finish;
 */

public class CounterTwo {
    public static int sum(int start, int finish) {
        int sum = 0;
        for ( ;start <= finish; start++) {
            sum = sum + start ;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for ( ; start <= finish; start++) {
            if ( start % 2 == 0 ) {
                sum = sum + start ;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}

