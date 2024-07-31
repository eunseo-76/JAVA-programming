package com.kenny.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {

        /* 자동 형변환 규칙 */

        /* 작은 자료형에서 큰 자료형으로 자동 형변환 */
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        /* 연산 시 일어나는 자동 형변환 */
        int num1 = 10;
        long num2 = 20;
        //int result1 = num1 + num2;  //long 타입을 int에 담는 건 불가
        long result1 = num1 + num2;

        float fnum = 4.0f;
        double dnum = fnum;
        //float result2 = fnum + dnum;
        double result2 = dnum;

        /* 모든 정수는 모든 실수로 자동 형변환 가능 */

        long eight = 8; //long은 8byte 할당
        float four = eight; //float는 4byte 할당되지만 실수이기 때문이 long 담을 수 있음

        /* 문자형은 int로 자동 형변환 가능 */
        char ch1 = 'a';
        int charNumber = ch1;   //int로 가능하다 = long으로도 가능하다(short는 안 됨)

        /* int로 type이 정해지지 않은 리터럴 형태의 정수는 char형 변수에 기록 가능 */
        char ch2 = 65;

        /* boolean은 형변환 규칙에서 제외된다. 어느 자료형이든 boolean을 형변환해서 담을 수 없다. */


    }
}
