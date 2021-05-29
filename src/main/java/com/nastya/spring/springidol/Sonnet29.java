package com.nastya.spring.springidol;

public class Sonnet29 implements Poem {

    private static String[] LINES = {"one two three",
                                     "four five six",
                                    "seven eight nine"};

    public Sonnet29() {
    }

    @Override
    public void recite() {
        for(int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}
