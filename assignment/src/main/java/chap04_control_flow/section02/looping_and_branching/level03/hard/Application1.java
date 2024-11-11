package chap04_control_flow.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("2보다 큰 정수를 하나 입력하세요. : ");
            int input = scanner.nextInt();

            int check = 0;
            if (input > 2) {
                // 소수 : 나누어 떨어지는 수가 1과 자기 자신
                for (int i = 1; i <= input; i++) {
                    if(input % i == 0) check++;
                }
                if (check == 2) {
                    System.out.println("소수다.");
                } else {
                    System.out.println("소수가 아니다.");
                }
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }
}
/* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요
 * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다." 출력
 *
 * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
 * 정수를 다시 입력 받을 수 있도록 한다.
 *
 * 소수란?
 * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
 * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다 => 모드 연산한 결과가 0인 값이 1, 자기 자신 뿐
 *
 * -- 입력 예시 --
 * 2보다 큰 정수를 하나 입력하세요 : 7
 *
 * -- 출력 예시 --
 * 소수다.
 * */

// 정답 : 1과 자기 자신을 제외한 나머지 중에서 나누어떨어지는 수가 있으면 소수가 아님, 없으면 소수임