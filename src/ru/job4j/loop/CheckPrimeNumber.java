package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i <= number / 2; i++) {
            int temp = number % i;
            if (temp == 0) {
                prime = false;
            } else {
                prime = true;

            }
            break;
        }
        return prime;
    }
}
