package com.kenny.section02.dimensional;

public class Application1 {
    public static void main(String[] args) {
        /* 다차원 배열의 구조를 이해하고 사용할 수 있다. */

        /* 1. 배열의 주소를 보관할 레퍼런스 변수 선언 (stack) */
        // stack에 레퍼런스 변수 생성
        int[][] iarr1;   // 권장
        int iarr2[][];
        int[] iarr3[];

        /* 2. 여러 개의 1차원 배열의 주소를 관리하는 레퍼런스 배열 생성 (heap)*/
        // (실제 값을 저장하는 공간 x)
//        iarr1 = new int[][];    -> 크기를 저장하지 않아 에러
//        iarr1 = new int[][4];   -> 주소를 묶어서 관리할 배열의 크기를 지정하지 않아 에러. 값을 저장하는 4개 공간만 만드는 것
        iarr1 = new int[3][];   // 1차원 배열 3개 묶어서 만들겠다

        /* 3. 주소를 관리하는 배열의 인덱스마다 배열을 할당(heap) */
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        /* 2, 3번의 과정을 한 번에 처리할 수 있다. */
        iarr2 = new int[3][5];  // <- 정변배열 : 각각의 1차원 배열의 크기가 같음
        // 가변 배열의 경우 이렇게 한 번에 쓰지 못하고 2, 3번의 과정처럼 나눠서 선언해야 함

        /* 4. 각 배열의 인덱스에 차례로 접근해서 값 출력*/
        for(int i = 0; i < iarr1[0].length; i++){
            System.out.print(iarr1[0][i] + " ");
        }
        System.out.println();

        for(int i = 0; i < iarr1[1].length; i++){
            System.out.print(iarr1[1][i] + " ");
        }
        System.out.println();

        for(int i = 0; i < iarr1[2].length; i++){
            System.out.print(iarr1[2][i] + " ");
        }
        System.out.println();

        /* 이중 for문으로 2차원 배열 인덱스 접근 */
        for(int i = 0; i < iarr2.length; i++){  // 행 컨트롤
            for(int j = 0; j < iarr2[i].length; j++){   //열 컨트롤
                System.out.println(iarr2[i][j] + " ");
            }
            System.out.println();
        }
        // iarr2.length : 행의 개수 3개
        // iarr2[i].length : 각 행의 길이
    }
}
