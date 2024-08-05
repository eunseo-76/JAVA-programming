package com.kenny.section05.parameter;

public class Rectangle {
    private double width;
    private double height;

    // 생성자
    // 객체 생성 시 초기화하면서 생성
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
