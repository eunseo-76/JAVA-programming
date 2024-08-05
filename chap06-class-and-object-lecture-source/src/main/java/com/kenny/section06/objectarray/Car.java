package com.kenny.section06.objectarray;

public class Car {
    private String modelName;
    private int maxSpeed;

    // 초기화하며 객체 생성
    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed() {
        System.out.println(modelName + "이(가) 최고 시속 " + maxSpeed + " km/h로 달려갑니다.");
    }
}
