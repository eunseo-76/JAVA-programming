package com.kenny.section03.branching;

public class A_break {
    public void testSimpleBreakStatement(){
        /* break 사용에 대한 흐름을 이해하고 적용할 수 있다.*/

        int sum = 0;
        int i = 1;
        while(true) {   // true 이면 무한 루프
            sum += i++; // 후위연산자는 다른 연산이 모두 끝난 뒤 동작함!
            if(i > 100) break;
        }
        System.out.println("sum = " + sum); // 무한 루프 뒤에 명령어를 쓰면 컴파일 에러 발생
    }

    public void testSimpleBreakStatement2(){
        /* 중첩 반복문 내 break 사용에 대한 흐름을 이해하고 적용할 수 있다.
        * break는 모든 반복문을 종료하는 것이 아니라 가장 인접한 반복문의 실행을 종료한다. */

        for (int dan = 2; dan <= 9; dan++) {    //외부 for 문
            System.out.println("==== " + dan + "단 =====");
            for (int su = 1; su <= 9; su++) {    // 내부 for 문
                if(su > 5) break;   // break는 나와 인접한 반복문에서만 빠져나온다!
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }
    }

    // 내부 반복문에 break를 해도 외부 반복문이 무한 루프라 0, 1, 2, 3, 0, 1, 2, 3 ... 반복됨
    // 이럴 때 사용하는 방법 : break 할 위치를 지정함
    public void testJumpBreak(){
        /* 중첩 반복문 내에서 break 사용 시 jump(goto)에 대한 흐름을 이해할 수 있다. */
        label:  // 이름은 label이 아니라 다른 것이어도 됨. 반복문 상단에 이름 짓고 break에 쓴다.
        for(;;){    // for 문에 아무것도 안 쓰면 무한 루프
            for(int i = 0; i < 10; i++){
                System.out.println(i);
                if(i == 3) break label;
            }
        }
    }
}
