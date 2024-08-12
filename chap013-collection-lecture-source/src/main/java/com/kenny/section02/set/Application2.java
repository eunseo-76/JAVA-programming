package com.kenny.section02.set;

import java.util.LinkedHashSet;

public class Application2 {
    public static void main(String[] args) {
        /* LinkedListHashSet에 대해 이해하고 사용할 수 있다. */
        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        // LinkedHashet : linkedlist 처럼 저장된 요소들이 다음 데이터가 뭔지 주소값을 가짐
        // 순서를 control 할 수 있음

        lhset.add("java");
        lhset.add("mysql");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        /* HashSet이 가지는 기능을 모두 가지고 있으며 추가적으로 저장 순서를 유지하는 특징을 가지고 있다. */
        // 상속 구조를 알아두면 값 추가는 add, 갑 삭제는 remove 겠구나 하고 추측이 가능함.
        System.out.println("lhset: " + lhset);
    }
}
