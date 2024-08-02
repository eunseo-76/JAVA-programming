package com.chap05_array.section01.array.level04.advanced;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        arr[0] = (int) (Math.random() * 45) + 1;
        // x _ _ _ _ _
        for (int i = 1; i < arr.length; i++) { //1~6
            // arr[0] 중복 체크 x
            // arr[1] 부터 숫자 이전까지 중복 체크해야함
            //arr[0]~[6]까지 들어가서 indexoutofbounds 에러 발생
            arr[i] = (int) (Math.random() * 45) + 1;    //i=0, j=0~5 i=1, j=0~5
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){   //arr.length 라고 쓰면 0부터 들어간 숫자가 아니라 5까지 계속 반복하므로 무한 루프 발생함
                    arr[i] = (int) (int) (Math.random() * 45) + 1;
                }
//                else{
////
////                    System.out.println("else");
////                }
                //if만 써도 됨 else 안 붙여도 됨
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}

// 중복 x -> 하나 뽑을 때 마다 배열 전체 한 번 싹 돌아서 같은 값 있는지 확인
// 중복되면 다시 뽑기 -> 다시 확인
// 중복 아니면 그대로 나가기


/* 로또번호 생성기
 * 6칸 짜리 정수 배열을 하나 생성하고
 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
 * 오름차순 정렬하여 출력하세요.
 * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
 * */