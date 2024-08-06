package com.kenny.section01.extend;

// 부모
public class Car {
    private boolean runningStatus;

    // 기본 생성자
    public Car() {
        /* 모든 클래스는 Object 클래스의 후손이다. */
        // FireCar -> Car -> Object
        super();    // Car 클래스를 사용할 때 아무 표시 안 했지만. JAVA의 모든 클래스는 Object 클래스의 후손
        System.out.println("Car 클래스의 기본 생성자 호출");
    }


    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빵!빵!");
        } else {
            System.out.println("주행 중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }
    // private <- 외부에서 사용 x Car 클래스 내부에서만 사용 할 것이다
    // protected : 나를 상속하는 애들도 사용할 수 있가!
    /* private */protected boolean isRunning() { return runningStatus; }

}
