package com.oops.interfeces;

public class Apple extends Computer implements Laptop, TouchScreen {

    @Override
    public void copy() {
        System.out.println("Apple copy method");
    }

    @Override
    public void cut() {
        System.out.println("Apple cut method");
    }

    @Override
    public void paste() {
        System.out.println("Apple paste method");
    }

    @Override
    public void keyBoard() {
        System.out.println("Apple keyBoard method");
    }

    @Override
    public void touch() {
        System.out.println("Apple touch method");
    }

    public void camera() {
        System.out.println("Apple camera method");
    }
}
