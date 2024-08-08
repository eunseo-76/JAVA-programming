package com.kenny.section5.calendar;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        /* java.util.Date 클래스 사용법을 이해하고 사용할 수 있다.  */

        /* 1. 기본 생성자 */
        Date today = new Date();
        System.out.println(today);  // 레퍼런스 변수를 출력했는데 값이 나오는 것은 오버라이딩 되어 있기 때문

        /* 2.매개변수 생성자 Date (long date)
        * 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 밀리세컨드로 계산한다.  */
        Date time = new Date(1000000L);
        System.out.println(time);

        // 이 외의 기능들은 대부분 deprecated 되어 있다.

    }
}
