package com.kenny.chap03.section01.sorting;


import java.util.Arrays;

public class C_InsertionSort {
    /* 삽입 정렬(Insertion Sort)
     *   이미 정렬된 데이터 범위에 정렬되지 않은 데이터를 적절한 위치에 삽입시켜 정렬하는 방식이다.
     *   시간복잡도는 O(n^2)이라 효율적이지는 않다.
     *   해당 위치에 있는 값을 앞의 어떤 위치에 들어갈지 훑어보며 밀어주다 원하는 위치에 넣게 된다.
     * */

    public static void solution(int[] arr) {

        for (int i = 1; i < arr.length; i++) {  // 0부터 length -1까지 해도 되지만, 0번은 정렬되어있다고 가정하므로 1번부터로 함
            System.out.println((i + "번째: " + Arrays.toString(arr)));
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                // i 인덱스의 앞으로 탐색하면서 기준 값 보다 큰 경우 뒤로 하나씩 인덱스를 민다.
                if(arr[j] > temp) arr[j+1] = arr[j];
                else break;     // 내가 만난 j 인덱스에 있는 값이 나보다 작은 경우 -> 나보다 큰 곳으로 가야 함
            }
            arr[j + 1] = temp;
        }
    }
}
