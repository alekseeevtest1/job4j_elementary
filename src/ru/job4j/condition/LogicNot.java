package ru.job4j.condition;

import java.util.Scanner;

/**
 * В нем уже есть методы isEven() - проверяет, что число четное,
 *
 * isPositive() -  проверяет, что число положительное.
 *
 * Вам нужно написать код в эти методы используя сочетания методов указанных ниже:
 *
 * - метод notEven(), проверяет, что число нечетное
 *
 * - метод notPositive(), проверяет, что число не положительное
 *
 * - метод notEvenAndPositive(), проверяет, что число нечетное и положительное
 *
 * - метод evenOrNotPositive(), проверяет, что число четное или не положительное
 */

public  class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return  !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {

        return  (!isEven(num) && isPositive(num));

    }

    public static boolean evenOrNotPositive(int num) {


        return (isEven( num) || notPositive(num));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isEven(num));
        System.out.println(isPositive(num));
        System.out.println(notEven(num));
        System.out.println(notPositive(num));
        System.out.println(notEvenAndPositive(num));
        System.out.println(evenOrNotPositive(num));


    }

}