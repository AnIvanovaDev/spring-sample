package com.nastya.spring.springidol;

public class Piano implements Instrumental {
    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
