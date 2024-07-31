package com.kenny.section01.method;

public class Application3 {
    public static void main(String[] args) {
        /* 메소드 전달 인자(argument)와 매개변수(parameter)에 대해 이해하고 메소드 호출 시 사용할 수 있다. */
        Application3 app3 = new Application3();
        app3.testMethod(100);   // 리터럴 값 전달
        //app3.testMethod("10");
        //app3.testMethod(20, 30);
        //app3.testMethod();
        int age = 20;
        app3.testMethod(age);   // 변수 전달

        app3.testMethod(age * 3);

        //자동형변환
        byte byteAge = 10;
        app3.testMethod(byteAge);

        //자동형변환 불가
        //int에 byte 값을 넣는 건 괜찮지만 int에 long 값을 넣을 수는 x
        long longAge = 20;
        //app3.testMethod(longAge);
        app3.testMethod((int)longAge);
    }

    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
