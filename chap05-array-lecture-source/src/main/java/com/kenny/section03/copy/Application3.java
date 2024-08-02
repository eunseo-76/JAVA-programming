package com.kenny.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /* 깊은 복사를 이해하고 활용할 수 있다. */

        /* 원본 배열 */
        int[] originArr = {1, 2, 3, 4, 5};

        print(originArr);

        /* 1. for문 */
        int[] copyArr1 = new int[10];   // 공간이 부족해서 10개 공간으로 복사한다고 가정
        for(int i = 0; i< originArr.length; i++){
            copyArr1[i] = originArr[i]; // 원본 배열에 있는 모든 데이터를 카피 배열로
        }
        print(copyArr1);    // 새로운 배열에 데이터를 복사했음(물리적인 주소값은 다름 - hashCode로 확인 가능)

        /* 2. Object의 clone()
        * 동일한 길이, 동일한 값을 갖지는 배열이 생성 되어 복사 */
        int[] copyArr2 = originArr.clone();

        print(copyArr2);

        /* 3. System의 arraycopy() */
        int[] copyArr3 = new int[10];
        System.arraycopy(originArr, 0, copyArr3, 0, originArr.length);
        //arraycopy에 ctrl 클릭 했을 때 native 나옴
        //native는 low level에서 작성되어 코드를 안 보여준다는 뜻
        print(copyArr3);

        /* 4. Arrays.copyOf() */
        int[] copyArr4 = Arrays.copyOf(originArr, 7);
        // copyOf를 ctrl 우클릭 해 보면 arraycopy 사용한다는 걸 알 수 있음.
        // copyOf는 arraycopy를 이용하는데, new length를 받아 copy하도록 함
        // max, min 조건 있으니 다시 들어가서 보기!

        print(copyArr4);

        int[] copyArr5 = Arrays.copyOf(originArr, 3);

        print(copyArr5);

    }

    public static void print(int[] arr){
        // 매개변수로 string 배열을 전달받는 메소드
        System.out.println("arr의 hashCode : " + arr.hashCode());

        // 매개변수로 전달 시 얕은 복사가 됨(주소값이 전달됨)
        // 메소드에서 해당 배열로 원하는 행동을 할 수 있다

        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
