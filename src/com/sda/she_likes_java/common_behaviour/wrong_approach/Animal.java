package com.sda.she_likes_java.common_behaviour.wrong_approach;

public class Animal implements Moveable {
    public void go() {
        System.out.println("go() from Animal");
    }

    @Override
    public void move() {
        System.out.println("Animal is moving");

    }
}