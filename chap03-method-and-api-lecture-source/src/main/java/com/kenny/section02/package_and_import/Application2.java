package com.kenny.section02.package_and_import;
import com.kenny.section01.method.Calculator;

import static com.kenny.section01.method.Calculator.max;
// 2. import static class

public class Application2 {
    public static void main(String[] args) {
        /* import에 대해 이해할 수 있다.
        * 매번 풀클래스명을 작성하기는 번거로우므로 패키지명을 생략하고 사용할 수 있도록 import 구문을 사용한다
        * */
        /* 1. non-static method*/
        //com.kenny.section01.method.Calculator  // Calculator의 풀 클래스명
        Calculator calculator = new Calculator();
        System.out.println(calculator.min(10, 20));

        /* 2. static-method*/
        System.out.println(Calculator.max(10, 20));
        /* static 메소드 호출 시 import static을 하면 클래스명도 생략하고 호출할 수 있다. */
        System.out.println(max(10, 20));
    }

    // f2 : 컴파일 에러가 나는 부분으로 커서 이동
    // alt + enter : 인텔리제이가 컴파일 에러 해결하기 위한 솔루션 제공
}
