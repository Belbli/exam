package com.github.belbli.topic10;

public class Main {

    public static void main(String[] args) {
        String s = "323" + 2;
        String s2 = 2 + "323";
        Name monday = Name.valueOf("MONDAY");

        byte b = 1;
        int sh = Short.MAX_VALUE * Short.MAX_VALUE;

        int i = 100;
        long l = i;
        double d = l;


        monday.name();
        switch (monday) {
            case TUESDAY:
                System.out.println("1");
                break;
        }
        // int i = 2 + true;
    }

    enum Name {
        MONDAY, TUESDAY;
    }
}
