package ru.job4j.arrays;
// {true, true, true} - вернет true; массив однородный, он заполнен true.
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
       for (int i = 0; i < data.length; i++){
           if (data[0] == data[i] ){

           }else {
               result = false;
               break;
           }

       }
        return result;
    }
}