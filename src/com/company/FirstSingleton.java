package com.company;

public class FirstSingleton {

    private static FirstSingleton INSTANCE;
    private int num = 0;

    private FirstSingleton() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static FirstSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FirstSingleton();
        }
        return INSTANCE;
    }
}
