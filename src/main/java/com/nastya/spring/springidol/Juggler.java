package com.nastya.spring.springidol;

public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerfomanceException {
        System.out.println("Juggling " + beanBags + " beanbags.");
    }
}
