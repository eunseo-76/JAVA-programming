package com.chap04_control_flow.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

// 이 문제 다시 해보기~~~!
public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int input = scanner.nextInt();
        String str = "";


        for(int i=0; i<input; i++){
            if(i % 2 == 0){
                str = "수";
            }else{
                str = "박";
            }
            System.out.print(str);
        }



//        String str1 = "수박";
//        String str2 = "수";
//        if(input % 2 == 0){
//            //짝수 입력 받으면 '수박' 을 input / 2 만큼 반복
//            System.out.println(str1.repeat(input/2));
//        }else{
//            //홀수 입력 받으면 '수박' 를 input / 2 만큼 반복하고 '수' 1회 추가
//            System.out.println(str1.repeat(input/2)+str2);
//        }
    }


}
/* 정수를 입력받아 1부터 입력받은 정수까지
 * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
 *
 * -- 입력 예시 --
 * 정수를 입력하세요 : 5
 *
 * -- 출력 예시 --
 * 수박수박수
 * */