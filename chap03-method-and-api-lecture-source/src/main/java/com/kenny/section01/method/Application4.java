package com.kenny.section01.method;

public class Application4 {
    public static void main(String[] args) {
        /* 메소드 전달 인자(argument)와 매개변수(parameter)에 대해 이해하고 메소드 호출 시 사용할 수 있다. */
        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '남');    // 순서 바뀌면 안 됨!
    }

    public void testMethod(String name, int age, final char gender){
        // final이 아닌 name, age는 이 메소드에서 변경 가능
        // gender는 final이기 때문에 값 변경 가능
        /* 매개변수도 일종의 지역변수이다. final 키워드도 사용 가능하다.
        * 단, 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다. */

//        name = "홍길동";
//        age = 20;
//        gender = 'M';

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age);
        System.out.println("세 이며, 성별은 " + gender + "입니다.");

        /* void 메소드의 경우 컴파일러가 자동으로 추가해주므로 명시적 작성이 필요 없다. */
        return; // 일부러 메소드를 종료시키기 위해 쓰기는 함

        // 모든 메소드는 return 이 있는데(내부적으로 자동으로 함), void는 명시적으로 작성할 필요가 없어서 안 쓰는 것

        //System.out.println("출력");
        // 이건 안 됨! 메소드는 return을 만나면 메소드가 종료되어 돌아가야 하므로 다른 명령어를 쓸 수 없다
    }
}
