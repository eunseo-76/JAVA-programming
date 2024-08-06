package com.kenny.section01.extend;

public class FireCar extends Car {
    /* Car 클래스의 모든 멤버(필드, 메소드)를 상속 받을 수 있다.
     * 단, 생성자는 상속 받지 못하며 부모의 private 멤버는 접근이 불가능하다. */
    // private는 상속은 받지만 접근이 안 됨

    public FireCar() {
        /* 모든 생성자에는 맨 철 줄에 super(); 를 컴파일러가 자동으로 추가한다.
         * 부모의 기본 생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용 가능하다. */
        super();
        System.out.println("FireCar 클래스 기본 생성자 호출");
    }

    /* soundHorn 메소드 재작성
     * @Override 어노테이션 : 오버라이딩 성립 요건을 체크하여 성립 되지 않는 경우 컴파일 에러를 발생시킨다. */
    @Override   // 필수는 아님
    // override를 붙여주면 여기에 부모 클래스의 내용이 없다고 체크 가능
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빠아앙~! 빠아앙~!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요.");
        }
    }

    /* 상속은 자식 클래스가 부모 클래스를 확장하는 것이므로 FireCar만의 추가 기능도 작성할 수 있다. */
    public void sprayWater() {
        System.out.println("물을 뿌립니다 ================>>>>>>>>>>>>");
    }

}
