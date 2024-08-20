package com.kenny.chap03.section01.sorting;

import java.util.Arrays;

public class E_MergeSort {
    public static void solution(int[] arr) {
        int[] temp = new int[arr.length];   // 병합한 데이터를 저장할 임시 공간
        mergeSort(arr, temp, 0, arr.length -1);
        System.out.println("==================================");
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // 양쪽으로 쪼개기(중간값 기준으로 왼쪽, 오른쪽)
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            // 첫 번째 데이터는 이미 정렬이 되어 있다는 것을 전제로 작성
            merge(arr, temp, left, mid, right);
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {

        System.out.println("병합 전 : " + Arrays.toString(arr));
        System.out.println("(" + left + ", " + right + ")");

        // temp 초기화
        for(int i=left; i<=right; i++) {
            temp[i] = arr[i];
        }

        int first = left, second =  mid + 1, index = first;

        /* 앞의 배열의 값이 다 소진이 되거나 뒤의 배열의 값이 다 소진이 되기 전까지 반복 */
        while (first <= mid && second <= right) {
            // 4개 짜리 배열을 8개로 병합해야 하는 경우
            if(temp[first] < temp[second]) arr[index++] = temp[first++];
            else arr[index++] = temp[second++];
        }
        // 두 번째 배열의 값만 전부 들어가서 second=right로 끝나 반복문이 종료되는 경우, arr가 미리 끝나버리는 문제
        // 첫 번째 배열의 값만 전부 들어가 first=left로 끝나는 건 상관이 없다. 첫 + 두 배열은 temp와 같기 때문

        /* 뒤의 배열의 값이 다 소진되지 않았을 경우는 문제가 없으나
        * 앞의 배열의 값이 다 소진되지 않았을 경우는 arr 쪽으로 옮겨 담아 주어야 한다. */
        for (int i = 0; i <= mid - first; i++) {// [ f |  |   |  | m ]
            arr[index + i] = temp[first + i];
        }

        System.out.println("병합 후 : " + Arrays.toString(arr));
    }
}
