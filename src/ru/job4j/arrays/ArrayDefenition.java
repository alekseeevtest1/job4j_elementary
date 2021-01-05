package ru.job4j.arrays;

public class ArrayDefenition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surr = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surr.length);
        System.out.println(prices.length);

        String[] str = new String[4];
        str[0] = "Aleks";
        str[1] = "Aleks1";
        str[2] = "Aleks3";
        str[3] = "Aleks4";
        System.out.println();
        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);

    }
}
