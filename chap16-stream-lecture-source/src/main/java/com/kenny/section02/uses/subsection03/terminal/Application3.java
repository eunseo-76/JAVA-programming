package com.kenny.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 collect에 대해 이해하고 사용할 수 있다. */

        // Member의 정보를 저장하기 위한 list
        List<Member> memberList = memberList = Arrays.asList(
                new Member("test01", "홍길동"),
                new Member("test02", "유관순"),
                new Member("test03", "신사임당")
        );

        // 내가 원하는 정보(member의 이름)를 저장하기 위한 list
        // 원하는 것만 뽑아내기 위해 Map 사용

        // Stream Member로 변환 -> Member 이름만 뽑아서 반환(중간 연산) -> 리스트로 변경
        List<String> memberNameList = memberList.stream()
                .map(member -> member.getMemberName())  // stream<String> 타입 (반환한 MemberName이 String 타입이므로)
                // .map(Member::getMemberName) 이렇게 써도 됨
                .collect(Collectors.toList());  // 리스트로 만들어줘야 한다
//                .toList();
        System.out.println("memberNameList: " + memberNameList);

        // id를 내가 원하는 문자열의 형태로 추출하기
        String str = memberList.stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining(","));  // join : 문자열 합치기. 기준 문자 전달 가능
        System.out.println("str: " + str);

        // collect에 어떤 인자를 주냐에 따라 결과가 달라진다

        String str2 = memberList.stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining("||", "**", "**"));
        // joining의 인자를 여러 개 전달하면 기준 문자, 접두사, 접미사가 추가됨


        Map<Integer, Long> countByNameLength = memberList.stream()
                .collect(Collectors.groupingBy(m -> m.getMemberName().length(), Collectors.counting()));
        // grouping 할 기준, counting
        System.out.println(countByNameLength);
    }

}
