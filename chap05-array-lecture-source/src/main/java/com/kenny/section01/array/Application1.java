package com.kenny.section01.array;

public class Application1 {
    public static void main(String[] args) {
        /* 배열의 선언 및 할당 */
        int[] arr = new int[5];
        // 5개의 int 타입 공간이 heap에 연속적으로 할당
        // 그 공간의 위치에 대한 주소값이 arr이라는 레퍼런스 변수에 담겨 참조됨

        /* 하나의 이름으로 관리되는 연속 된 메모리 공간이며, 해당 공간을 찾아갈 인덱스가 있다. */
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        /* 인덱스를 반복문으로 처리할 수 있다. */
        // 배열의 길이값으로 반복문 처리(length 미만!)
        // 최기식에 변수를 여러 개 선언할 수 있다!
        for(int i = 0, value = 0; i< arr.length; i++){
            arr[i] = value += 10;   // value +=10 먼저 연산 진행
            System.out.println(arr[i]);
        }

        int sum = 0;

        /* 향상 된 for문
        * for(한번의 반복문에서 사용 될 변수 : 반복을 수행할 배열)
        * 배열 인덱스의 값을 꺼내서 int j 라는 변수에 담아서 사용하는 맥락이므로
        * j에 값을 담더라도 배열의 값에는 변화가 없음. => 배열의 값을 참조할 수 있으나 변경할 수 없음
        * 향상 된 for문은 배열에 무슨 값이 있는지 확인할 때 사용된다.  */
        for (int j : arr) {
            System.out.println("j = " + j);
            sum += j;
        }
//        for(int i = 0; i< arr.length; i++){
//            sum += arr[i];
//        }
        System.out.println("sum = " + sum);

        // 차이
        // 배열이 대입 연산자의 왼쪽/오른쪽에 있는지의 차이
        // 대입 연산자의 오른쪽 : 값
        // 대입 연산자의 왼쪽 : 공간
        // 위쪽의 for문은 공간에 접근해서 값을 대입해라
        // 아래쪽의 for문은 공간의 값을 가져와라
        // 향상 된 for문은 값을 참조해올 때만 사용할 수 있음.(값을 넣는 것은 불가능)
    }
}
