package alishevMarafon.day4;

import java.util.Random;
import java.util.Scanner;

/**
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        Random rand = new Random();
        int[] mass = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            mass[i] = rand.nextInt(10);

        }
        System.out.println("Длине массива " + mass.length);
        int count = 0;
        for(int i = 0; i < mass.length; i++){

            if (mass[i] > 8){
                count++;

            }

        }
        System.out.println("Количество чисел больше 8: " + count);
        int count2 = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1){
                count2++;
            }

        }
        System.out.println("Количестве чисел равных 1 " + count2);

        int count3 = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0){
                count3++;
            }

        }
        System.out.println("Количестве четных чисел " + count3);

        int count4 = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0){
                count4++;
            }

        }
        System.out.println("Количество нечетных чисел: " + count4);

        int sum = 0;
        for (int i = 0;i < mass.length; i++){
            sum = sum + mass[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);




     }
}
