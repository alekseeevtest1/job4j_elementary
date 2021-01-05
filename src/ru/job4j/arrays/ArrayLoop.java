package ru.job4j.arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] in = new int[5];
        for (int i = 0; i < in.length; i++) {
            in[i] = i * 2 + 3;

        }
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }
}
