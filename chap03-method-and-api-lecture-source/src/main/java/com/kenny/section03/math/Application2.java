package com.kenny.section03.math;

public class Application2 {
    public static void main(String[] args) {
        /* 사용자 지정 범위의 난수 발생시키 */

        /* 1. 0 ~ 9 사이의 난수 */
        int random1 = (int) (Math.random() * 10);
        // 0 <= ? < 1
        // 0 <= ? > 10
        System.out.println(random1);

        /* 2. 1 ~ 10 사이의 난수 */
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println(random2);

        /* 3. -128에서 127 사이의 난수 */
        int random3 = (int) (Math.random() * 256) - 128 ;
        System.out.println(random3);
        // 구하고자 하는 난수의 개수를 곱하고
        // 시작 값을 더한다
    }
}
