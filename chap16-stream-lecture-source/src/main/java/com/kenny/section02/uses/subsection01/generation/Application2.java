package com.kenny.section02.uses.subsection01.generation;

import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        /* 기본 타입 스트림 생성에 대해 이해하고 사용할 수 있다. */
        IntStream intstream = IntStream.range(5, 10);   // 시작값, 종료값
        intstream.forEach(value -> System.out.print(value + " "));
        System.out.println();
        // range에서 종료값은 포함되지 않음(10 이 아니라 9까지 출력)

        LongStream longstream = LongStream.rangeClosed(5, 10);   // 종료값까지 포함
        longstream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* Wrapper 클래스 자료형의 스트림으로 변환이 필요한 경우 boxing 할 수 있다. */
        // random 객체가 가지는 doubles 메소드 호출
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* 문자열을 IntStream으로 변환할 수 없다. */
        // chars() : String 클래스에.
        IntStream helloworldChars = "hello world".chars();
        helloworldChars.forEach(value -> System.out.println(value + " "));
        System.out.println();

        /* 문자열을 split 해서 Stream으로 생성할 수 있다.*/
        Stream<String> splitScream = Pattern.compile(",").splitAsStream("html, css, javascript");
        splitScream.forEach(value -> System.out.print(value + " "));    // pattern에서 split 해서 string을 만들어달라
        System.out.println();

        /* Stream.of() */
        Stream<String> stringStream1 = Stream.of("hello", "world");
        Stream<String> stringStream2 = Stream.of("java", "mariadb");

        /* 스트림은 1회성으로 사용 가능하며 ㅇ이미 열린 스트림은 재사용 불가능하다.
        * 재사용하려고 할 경우 java.long.IllegalStateException: 이 발생한다. */
//        stringStream1. forEach(value -> System.out.print(value + " "));
//        stringStream2. forEach(value -> System.out.print(value + " "));

        /* concat()을 이용하여 두 개의 스트림을 동일 타입 스트림으로 합칠 수 있다. */
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        concatStream.forEach(value -> System.out.print(value + " "));

    }
}
