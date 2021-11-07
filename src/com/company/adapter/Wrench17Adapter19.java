package com.company.adapter;

public class Wrench17Adapter19 implements NutBolt{
    Wrench17 wrench17;

    public Wrench17Adapter19(Wrench17 wrench17) {
        this.wrench17 = wrench17;
    }

    @Override
    public void turn() {
        wrench17.rotate();
    }
}
