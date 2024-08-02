package com.kenny.section02.dimensional;

public class Application2 {
    public static void main(String[] args) {
        /* 2차원 가변 배열을 선언 및 할당하여 사용할 수 있다. */

        /* 가변 배열의 경우 각 인덱스별 배열을 다로 할당해야 한다. */
        int[][] iarr = new int[3][];

        System.out.println(iarr);   // stack의 레퍼런스 배열 참조 주소값
        System.out.println(iarr[0]);    // heap의 1차원 배열 참조 주소값 (현재는 할당하지 않아 null)
//        System.out.println(iarr[0][0]); // 존재하지 않는 공간을 참조하므로 NullPointerException 발생
        iarr[0] = new int[3];
//        iarr[1] = new char[2];
        iarr[1] = new int[2];

        // 미리 할당한 1차원 배열의 주소값을 iarr[2]에 넘겨줄 수도 있음
        int[] arr = new int[5];
        iarr[2] = arr;

        /* 가변 배열도 정변 배열에서 사용한 것과 동일하게 반복문을 이용해서 인덱스를 참조할 수 있다. */
        int value = 1;
        for(int i = 0; i < iarr.length; i++){   // 레퍼런스 배열의 길이
            for(int j = 0; j < iarr[i].length; i++){    // 행의 길이
                iarr[i][j] = value++;
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }
        // ArrayIndexOufOfBoundsException!!s

    }
}
