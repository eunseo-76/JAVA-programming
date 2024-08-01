package com.kenny.section02.looping;

import java.nio.file.FileStore;
import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        /* for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        for (int i=0; i<10; i++){
            // 초기식 : int i=0;
            // 조건식 : i<10;
            // 증감식 : i++;
            // 1. for 문 만나서 초기식이 1회 실행
            // 2. 조건식 만나고 블럭으로 진입
            // 3. 블럭이 끝나면 상단으로 올라와 증감식 실행
            // 4. 증감식의 결과가 조건식을 만족하는지 확인
            // 5. 다시 증감
            System.out.println("출력 : "+ 1);
        }
    }

    public void testForExample() {
        /* 1 ~ 10 까지의 합계 구하기 */
        int sum = 0;
        for(int i=0; i<10; i++){
            sum += i;
            //ctrl + shift + enter
        }
    }

    public void testForExample2(){
        /* 5 ~ 10 사이의 난수를 발생시켜 1부터 발생한 난수 까지의 합 구하기 */

        int sum = 0;
        int random = (int) (Math.random() * 6) + 5;
        for(int i=1; i<=random; i++){
            sum += i;
        }
        System.out.println("1부터 " + random + "까지의 합계 : " + sum);
    }

    public void testForExample3(){
        /* 숫자 2개를 입력받아 작은 수에서 큰 수까지의 합계를 구한다.
        * 동일한 숫자는 입력하지 않는다는 가정으로 해결한다.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int firstNum = scanner.nextInt();
        System.out.println("두 번째 정수 : ");
        int secondNum = scanner.nextInt();

        int sum = 0;
        /* first와 second 중 어떤 것이 작은 수이고 큰 수인지 먼저 핀별한 뒤 합계를 구한다.*/
        int min = 0;
        int max = 0;

        if (firstNum > secondNum){
            max = firstNum;
            min = secondNum;
        }else {
            max = secondNum;
            min = firstNum;
        }
        for(int i=min; i<=max; i++){
            sum += i;
        }
        System.out.println(min + "에서 " + max + "까지의 합계 : " + + sum);
    }

    public void printSimpleGugudan(){
        /* 사용자가 입력하는 단의 구구단을 출력하기 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 구구단의 단 수 : ");
        int dan = scanner.nextInt();

        if (dan >= 2 && dan <= 9) {
            for (int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
        } else {
            System.out.println("반드시 2~9 사이의 양수를 입력하셔야 합니다.");
        }
    }

}
