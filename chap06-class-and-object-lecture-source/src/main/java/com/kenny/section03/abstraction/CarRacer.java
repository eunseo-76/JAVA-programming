package com.kenny.section03.abstraction;

public class CarRacer {
    private Car car = new Car();    //한 명의 운전자가 하나의 자동차를 소유한다고 가정

    public void startUp() {car.startUp();}

    public void stepAccelator() { car.go();}

    public void stepBreak() {car.stop();}

    public void turnOff() {car.turnOff();}
}

