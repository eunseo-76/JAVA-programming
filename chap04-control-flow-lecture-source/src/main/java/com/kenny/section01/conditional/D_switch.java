package com.kenny.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement(){
        /* switch 문 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        // if문은 if() 안에 true, false로 나뉘는 조건식을 넣는다.
        // switch 문은 switch() 안에 조건 값을 넣는다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int first = scanner.nextInt();
        System.out.println("두 번째 정수 : ");
        int second = scanner.nextInt();
        System.out.println("연산 기호 입력 : ");
        char op = scanner.next().charAt(0); //문자열을 받아서 첫 번째 문자 추출(scanner는 문자 받는 게 없음)

        int result = 0;

        // 기본적인 switch case문 형태
        switch(op){
            case '+': result = first + second; break;   // break : break가 없으면 다음 case가 이어서 실행됨
            case '-': result = first - second; break;
            case '*':
            case 'x':
                result = first * second; break; // *와 x가 입력되면 둘 다 * 연산 실행( case '*'에 break가 없기 때문)

            case '/': result = first / second; break;
            case '%': result = first % second; break;
            default:    //입력 값이 case안에 들어있지 않을 경우 수행할 내용. 그런 경우가 없으면 default를 빼도 됨
        }
        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void improveSwitchStatement(){
        /* java 14부터 적용된 개선 된 switch 문 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        // if문은 if() 안에 true, false로 나뉘는 조건식을 넣는다.
        // switch 문은 switch() 안에 조건 값을 넣는다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int first = scanner.nextInt();
        System.out.println("두 번째 정수 : ");
        int second = scanner.nextInt();
        System.out.println("연산 기호 입력 : ");
        char op = scanner.next().charAt(0); //문자열을 받아서 첫 번째 문자 추출(scanner는 문자 받는 게 없음)


        /* -> 를 사용하면 break를 사용한 것과 동일하며 오히려 작성하면 오류가 발생함
        * 2개 이상의 명령문을 작성해야 할 경우 {}로 표기해야 함.
        * 반환 값을 리턴할 수 있음. 단, 반드시 default가 있어야 함.
        * */
        int result = switch(op){
            case '+' -> {
                System.out.println("더하기 연산 실행");
                yield first + second;
            }
            case '-' -> result = first - second;
            case '*', 'x' -> result = first * second;

            case '/'-> result = first / second;
            // second가 0이면 발생할 수 있는 런타임 오류 java.lang.ArithmeticException: / by zero
            case '%'-> result = first % second;
            default -> 0;
            //반환되는 값이 result에 들어가야 하기 때문에 default가 없으면 op에 초기화할 값이 없음
        };
        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}
