package ru.job4j.arrays;
//char[] word = {'H', 'e', 'l', 'l', 'o'};
//char[] post = {'l', 'o'};

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - index - 1] != word[word.length - index - 1]) {
                return false;
            }
        }
        return true;
    }
}