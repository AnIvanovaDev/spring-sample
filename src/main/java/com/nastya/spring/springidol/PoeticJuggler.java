package com.nastya.spring.springidol;

public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerfomanceException {
        super.perform();
        System.out.println("While juggling...`");
        poem.recite();
    }
}
