package com.edward.oop.example;
public class Display   
{
    private int __width;
    public int getwidth() {
        return __width;
    }

    public void setwidth(int value) {
        __width = value;
    }

    private int __height;
    public int getheight() {
        return __height;
    }

    public void setheight(int value) {
        __height = value;
    }

    public Display(int width, int height) throws Exception {
        this.setwidth(width);
        this.setheight(height);
    }

}


