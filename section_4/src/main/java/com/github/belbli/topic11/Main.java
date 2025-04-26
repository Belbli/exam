package com.github.belbli.topic11;


import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        char c = 'c';
        char h = 'h';
        char e = 'e';
        char[] hello = {'h', 'e', 'l'};
        char[] hello2 = hello;
        String str2 = new String("hello");
        String str = "hello";
        String replace = str.replace('e', 'E');
        int[] numbers = {1, 2, 3, 4, 5};

        int[] numbers2 = new int[10];
        // [___________________{1, 20, 43, 45, 51, 63}______________________________________]
        int number0 = numbers[0];
        // O(1);
        // O(n);
        // O(logn);
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i*2;
        }
        int length = numbers2.length;

        User[] users = new User[10];
        int lengt2h = numbers2.length;

        Set<Integer> set = new HashSet<>();
        set.add(Integer.valueOf(1));
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        int i = 2354433 % 7;

        //[0, 1, 2, 3, 4, 5, 6]
        System.out.println(set.size());
    }

    class User {
        int i2;
        Integer i3;

        public User() {
            System.out.println();
        }
    }
}
