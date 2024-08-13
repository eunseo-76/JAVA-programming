package com.kenny.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        // 스트림 생성 방법
        /* 배열이나 컬렉션을 이용하여 스트림을 생성하는 방법을 이해하고 사용할 수 있다. */

        /* 배열 스트림 생성 */
        String[] sarr = {"java", "maridb", "jdbc"}; // 배열 데이터가 있음
//        Arrays.stream(sarr);    // 배열 데이터를 스트림으로
        Stream<String> strStream1 = Arrays.stream(sarr);    // Stream 타입으로
        strStream1.forEach(System.out::println);    // forEach: 최종 연산 담당

        Stream<String> strStream2 = Arrays.stream(sarr,  0, 2); // 특정 값들만 stream으로 만들고 싶을 떄
        strStream2.forEach(System.out::println);

        /* 컬렉션 스트림 생성 */
        // 컬렉션 타입 -> 스트림 변경
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        /* 컬렉션에도 forEach 메소드는 정의되어 있으므로 stream화 하지 않고도 사용 가능하다. */
//        stringList.forEach(System.out::println);
        Stream<String> strStream3 = stringList.stream();    // list에서 stream 메소드 사용하면 타입이 stream으로 바뀜
        strStream3.forEach(System.out::println);

        /* Builder를 활용한 스트림 생성 */
        // Stream 클래스의 builder() 메소드
        // builder() : 리턴값이 builder 타입
        Stream<String> strStream4 = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();   // Stream<String> 타입이 생성됨
        strStream4.forEach(System.out::println);

        /* iterator() 를 활용하여 수열 형태의 스트림을 생성할 수 있다. */
        Stream<Integer> intStream = Stream.iterate(10, value -> value * 2).limit(10);
        intStream.forEach(System.out::println);

    }
}
