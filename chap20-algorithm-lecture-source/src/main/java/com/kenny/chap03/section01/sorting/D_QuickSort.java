package com.kenny.chap03.section01.sorting;
/* 퀵 정렬(Quick Sort)
 *   기준값(pivot)을 선정해 해당 값보다 작은 데이터와 큰 데이터로 분류하는 것을 반복해서 정렬하는 것으로
 *   병합 알고리즘과 함께 실제 정렬 알고리즘으로 많이 활용되고 있다.
 *   시간 복잡도는 O(nlogn)이지만 최악의 경우는 O(n^2)이다.
 * */
public class D_QuickSort {
    public static void solution(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private static void quickSort(int[] arr, int low, int high) {
        int partition = process(arr, low, high);

    }

    /* low는 왼쪽, high는 오른쪽에서부터 진행하면서 pivot 기준으로 맞지 않는 값을 swap 하는 메소드 */
    private static int process(int[] arr, int low, int high) {

        int pivot = arr[(low + high) / 2];  // 홀수/2면??

        while (low <= high) {   // lo, hi가 교차되지 않을 때까지만

            while(arr[low] < pivot) low++;  // pivot보다 값이 작으면 low 진행
            while(arr[high] > pivot) high--;    // pivot보다 값이 크면 high 진행

            if (low <= high) {
                swap(arr, low, high);   // swap 해도 탐색할 값이 남았을 수 있음
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}

// 1 2 3 4 5 0 6 7 8 9 10
//   lo    pivot     hi
// 이렇게 pivot이 가장 작은 값이라 의미없는 경우, high는 계속 전진하고, low는 전진하지 않음.
// 1과 0이 swap되고 프로세싱이 종료될 수 있음. 이런 경우 효율이 안 나올 수 있다.
// nlogn의 복잡도를 가지기는 함(이진). 하지만 pivot을 적절히 고르지 않으면(중간값이 아닌 편향된 값) 선형적이 될 수도 있다.
