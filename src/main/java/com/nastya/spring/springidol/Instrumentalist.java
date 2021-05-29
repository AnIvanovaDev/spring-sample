package com.nastya.spring.springidol;

public class Instrumentalist  implements  Performer{
    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerfomanceException {
        System.out.print("Playing " + song + ": ");
        instrumental.play();
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrumental(Instrumental instrumental) {
        this.instrumental = instrumental;
    }

    private String song;
    private Instrumental instrumental;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
}
