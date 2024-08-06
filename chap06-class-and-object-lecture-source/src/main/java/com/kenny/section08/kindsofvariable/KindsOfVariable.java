package com.kenny.section08.kindsofvariable;

public class KindsOfVariable {
    /* 다양한 변수를 이해하고 사용할 수 있다. */

    // 전역 변수 : 메소드 안이 아니라 클래스 레벨에서 선언된 변수
    private int globalNum;  // 전역변수, 인스턴스 변수(non-static) -> 인스턴스(객체) 생성 시 globalNum 공간 할당 됨
    private static int staticNum;   // 전역변수, 클래스 변수(static) -> 프로그램 실행 시 정적 메모리 영역에 할당 됨

    public void method(int num) {   // int num : 매개변수 (일종의 지역변수)
        // 이 메소드의 지역변수 : 메소가 호출되어 동작하는 동안에만 stack 영역에 살아있음. 즉 {} 안에서만 살아있음
        // 메소드가 종료되면 사라진다

        int localNum;   // 지역변수

        /* 매갭변수는 호출 시 값이 전달되어 초기화되지만 지역변수는 선언 외의 사용을 위해서는
        * 반드시 초기화되어야만 한다 */

        System.out.println(num);    // 매개변수는 메소드를 호출하면서 값이 전달되기 때문에 이미 값이 초기화되어있다고 봄
//        System.out.println(localNum);   //초기화 되지 않으면 안됨

        System.out.println(globalNum);
        System.out.println(staticNum);
    }

    public void method2() {
        /* 지역변수는 해당 지역(블럭 내)에서만 사용이 가능하며
        * 전역변수는 클래스 내의 모든 영역에서 사용할 수 있다. */
//        System.out.println(localNum);   // cannot resolve.... 인식할 수 없다는 오류
        System.out.println(globalNum);
        System.out.println(staticNum);
    }
}
