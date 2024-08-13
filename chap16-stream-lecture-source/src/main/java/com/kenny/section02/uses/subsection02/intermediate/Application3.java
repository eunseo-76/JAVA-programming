package com.kenny.section02.uses.subsection02.intermediate;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application3 {
    public static void main(String[] args) {
        /* 스트림의 중계 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다.
        * 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어 준다. => flattening 평탄화 */

        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "springboot")
        );
        // 리스트 안에 리스트
        System.out.println(list);

        List<String> flatList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        // Collection 클래스의 stream을 사용하여 String들이 나열된 형태로 변환함
        // stream이 가지고 있는 요소들을 .String 시켜서 String 타입의 stream 타입에 담길 수 있도록 평탄화 작업
        // .collect(Collectors.toList()) : 위에는 중첩 구조를 해체함. 여기는 collect를 이용해 리스트로 바꿔주는 것.


        System.out.println(flatList);

        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Stream API",
                "flatMap Example"
        );

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());    // 추구 가공 가능
//        .toList();  // 이것도 stream을 List로 반환해 줌. 그러나 같지는 않다! Unmodifiable list 반환


        // 문장을 split 해서 단어로 만듦
        // 따로따로 분리된 단어를 리스트로 만들어 반환

        words.add("단어 추가"); // .toList() 에러 발생 : 불변 객체를

        System.out.println(words);

        /* Unmodifiable list (수정 불가 읽기 전용 리스트 - 불변성 보장) */
        // 컬렉션을 읽기 전용 리스트로 다루고 싶을 수 있음. 실수로 변경하지 않도록 함.

        // 수정 불가 리스트를 반환하는 경우
        List<String> unmodifiableList = Collections.unmodifiableList(flatList);
        List<String> unmodifiableList2 = List.of("A", "B", "C");
        List<String> unmodifiableList3 = Stream.of("A", "B", "C").toList();
    }

}
