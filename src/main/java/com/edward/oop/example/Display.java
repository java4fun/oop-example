package com.edward.oop.example;
public class Display   
{
    private int width;
    public int getwidth() {
        return width;
    }

    public void setwidth(int value) {
        width = value;
    }

    private int height;
    public int getheight() {
        return height;
    }

    public void setheight(int value) {
        height = value;
    }

    public Display(int width, int height) throws Exception {
        this.setwidth(width);
        this.setheight(height);
    }

}


