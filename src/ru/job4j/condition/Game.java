package ru.job4j.condition;

import java.util.Scanner;

public class Game {
    public static void menu(String name) {
        if (name.equals("super mario")) { /* сравниваем переменную name с "super mario" */
            System.out.println("Start - super mario");
        } else if (name.equals("tanks")) { /* Сравнить переменную name с "tanks" */
            System.out.println("Start - tanks");
        } else if (name.equals("tetris") ) { /* Сравнить переменную name с "tetris" */
            System.out.println("Start - tetris");
        }else {
            System.out.println("no this game");
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name =  scan.nextLine();
        Game.menu(name);
    }
}
