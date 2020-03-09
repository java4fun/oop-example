package com.edward.oop.example;
public class Display   
{
    private int width;
    public int getWidth() {
        return width;
    }

    public void setWidth(int value) {
        width = value;
    }

    private int height;
    public int getHeight() {
        return height;
    }

    public void setHeight(int value) {
        height = value;
    }

    public Display(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

}


