package com.kenny.section02.set;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /* TreeSet에 대해 이해하고 사용할 수 있다. */
        TreeSet<String> tset = new TreeSet<>();
        // TreeSet도 Set의 특징을 가짐. 추가는 add
        // Tree
        tset.add("java");
        tset.add("mysql");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        /* 자동 오름차순 정렬하여 이진 트리의 형태로 요소를 저장하고 있다.
        * String 클래스에 implements Comparable 을 통해 compareTo 메소드가 오버라이딩 되어 있는 기준으로 정렬된다. */
        System.out.println("tset: " + tset);    // 문자열 기준으로 정렬해서 저장됨

        // TreeSet<Student>에 add를 하면 어떻게 될까?
        // 정렬 기준이 필요함(compareTo 오버라이딩)

        for (String s : tset) {
            System.out.println(s);
        }

        /* 정렬, 중복 제거 특징을 이용한 로또 번호 발생기 */
        // TreeSet 만들기
        Set<Integer> lotto = new TreeSet<>();

        // 반복문을 돌며 데이터 추가
        while (lotto.size() < 6) {
            lotto.add(((int) (Math.random() * 45)) + 1);    // 1 ~ 45 범위
            // 만약 중복값이 생성되면 add 되지 않음
            // 중복값이 아니면 정렬되어 저장됨
        }
        System.out.println("lotto: " + lotto);

    }
}
