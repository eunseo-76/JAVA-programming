package com.kenny.section01.extend;

public class RacingCar extends Car {
    @Override
    public void run() {
//        super.run();
        System.out.println("레이싱카가 전속력으로 질주합니다!!!");
        // super : 부모 객체의 주소가 담긴 키워드
        // this : 자기 자신 객체의 주소가 담긴 키워드
    }

    @Override
    public void stop() {
//        super.stop();
        System.out.println("레이싱카가 멈춥니다.");
    }

    @Override
    public void soundHorn() {
//        super.soundHorn();
        System.out.println("레이싱카는 경적을 울리지 않습니다.");
    }
}
