package com.kenny.section01.method;

public class Application5 {
    public static void main(String[] args) {
        /* 메소드 리턴 값을 이해하고 활용할 수 있다. */
        Application5 app5 = new Application5();
        app5.testMethod();  // hello world가 여기로 옴!

        /* 메소드의 반환 값이 있을 경우 반환 값을 변수에 담을 수 있다. */
        String returnText = app5.testMethod();
        System.out.println("returnText: " + returnText);

        /* 변수에 담지 않고 바로 출력도 가능하다. */
        System.out.println(app5.testMethod());
    }
    public String testMethod(){
    // 반환형 String을 작성했으면 일치하는 데이터 타입을 return 해야 함
        return "hello world";
        // 반환이 되었다는 것은, 이 값이 호출된 위치로 갔다는 뜻(main의 app5.testMethod(); 위치에 hello world가 감)
    }
}
