package com.kenny.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        /* 매개변수 사용 가능 자료형
         * 1. 기본 자료형
         * 2. 기본 자료형 배열
         * 3. 클래스 자료형
         * 4. 클래스 자료형 배열
         * 5. 가변 인자
         * */
        ParameterTest pt = new ParameterTest();

        int num = 10;
        pt.testPrimaryTypeParameter(num);
        System.out.println("main num = " + num);

        int[] iarr = {1, 2, 3, 4, 5};
        pt.testPrimaryTypeArrayParameter(iarr);
        System.out.println("main iarr[0] = " + iarr[0]);

        Rectangle rectangle = new Rectangle(12.5, 22.5);  // 기본 생성자로 생성 x 가로세로 값 넣어줘야 함
        pt.testClassTypeParameter(rectangle);   // 객체의 주소값 전달

        System.out.println("main rectangle.getWidth() = " + rectangle.getWidth());  // 주소값을 가지고 참조
        System.out.println("main rectangle.getHeight() = " + rectangle.getHeight());


        // main에서 rectangle 생성해 12.5, 22.5로 초기화함.
        // main에서 참조하는 것도 동일하기 떄문에 32.5 출력
        // 기본 자료형과 참조 자료형의 차이 이해!!

//        pt.testVariableLengthArrayParameter();    // 가변인자는 name 뒤에 선언했기 때문에 반드시 name 하나는 있어야 함. hobby는 없어도 됨
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("홍길동", "볼링");   // 가변 인자는 0개도 가능
        pt.testVariableLengthArrayParameter("홍길동", "볼링", "축구", "테니스");
        pt.testVariableLengthArrayParameter("홍길동", new String[]{"볼링", "축구", "테니스"});

    }
}