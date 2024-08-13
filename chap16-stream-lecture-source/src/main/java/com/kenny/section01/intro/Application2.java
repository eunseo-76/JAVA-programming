package com.kenny.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림 병ㅇ렬 처리에 대해 이해할 수 있다 */

        List<String> list = new ArrayList<>(Arrays.asList("javaj", "mariadb", "html", "css", "mybatis"));

        /* 모든 작업은 기본적으로 main 스레드에서 일어난다. */
        System.out.println("foreach ===========");
        for (String s : list) {
            System.out.println(s + " : " + Thread.currentThread().getName());   // 이 코드를 수행하고 있는 thread의 이름 확인
            // single thread : 메소드 콜 스택이 하나만 있음
            // multi thread : 메소드 콜 스택이 하나 이상. 메소드의 호출과 동작이 병렬적으로 이루어짐
        }

        for (String s : list) {
            System.out.println(s + " : " + Thread.currentThread().getName());
        }

        /* 일반적인 스트림도 main 스레드에서 작업을 수행한다. */
        System.out.println("normal stream ==============");
        list.stream().forEach(Application2::print);
        list.stream().forEach(Application2::print);

        // 매개변수를 전달받되 리턴값이 없는 형태(forEach가 consumter를 상속(?))

        /* 병렬 스트림은 자동으로 병렬 처리가 되며 성능 상 유리하다.
        * 스트림을 활용하면 병렬 처릭가 손쉽다는 것이 장점 중 하나이다. */
        System.out.println("parallel stream ============");
        list.parallelStream().forEach(Application2::print);
        list.parallelStream().forEach(Application2::print);
        // forEach, normal Thread와 달리 순서대로가 아니며, 다른 스레드가 동작했음을 확인 가능

        // main, worker1, worker2, worker3 라는 메소드 콜 스택이 생성되어 병렬적으로 동작

    }
    // 문자열 값을 받아 문자열 + 현재 스레드가 뭔지 출력
    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
