package com.kenny.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement(){
        /* continue 문 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 4의 배수이면서 5의 배수인 값 출력 */
        for(int i = 1; i <= 100; i++){

            /* 4의 배수가 아니거나 5의 배수가 아님*/
            if(i % 4 != 0 || i % 5 != 0) continue;  //continue를 만나면 밑으로 진행 x 증감식으로 가서 반복함

            System.out.println(i);      // 4와 5의 배수인 경우에만 출력문 작동
        }
    }

    public void testSimpleContinueStatement2(){
        /* 중첩 반복문 내 continue 사용에 대한 흐름을 이해하고 적용할 수 있다.
         * continnue는 모든 반복문을 뛰어넘는 것이 아니라 가장 인접한 반복문의 실행만 건너 뛴다. */

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("==== " + dan + "단 =====");
            for (int su = 1; su <= 9; su++) {
                if(su % 2 == 0) continue;
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }
    }

    public void testJumpContinue(){
        /* 중첩 반복문 내 conitnue 문 사용 시 jumn(goto)에 대한 흐름을 이해하고 적용할 수 있다. */

        label:
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("==== " + dan + "단 =====");
            for (int su = 1; su <= 9; su++) {
                if(su % 2 == 0) continue label;     //뛰어넘을 반복문이 어디인지 나타냄
                // 원래는 바로 윗줄로 뛰어넘었지만, 이제 lable이 있는 외부 반복문으로 감
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }

    }


}
