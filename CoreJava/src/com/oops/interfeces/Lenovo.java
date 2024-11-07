package com.oops.interfeces;

public class Lenovo extends Computer implements Laptop {

    @Override
    public void copy() {
        System.out.println("Lenovo copy method");
    }

    @Override
    public void cut() {
        System.out.println("Lenovo cut method");
    }

    @Override
    public void paste() {
        System.out.println("Lenovo paste method");
    }

    @Override
    public void keyBoard() {
        System.out.println("Lenovo keyBoard method");
    }
}
