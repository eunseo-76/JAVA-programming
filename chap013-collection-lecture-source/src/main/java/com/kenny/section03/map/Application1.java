package com.kenny.section03.map;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* HashMap을 이해하고 활용할 수 있다. */
        HashMap map = new HashMap();

        /* 키와 값을 쌍으로 저장한다. 키와 값은 반드시 객체여야 한다. */
        // 제네릭이 없기 때문에 타입 관계 없이 자유롭게 저장 가능
        map.put("one", new Date());
        map.put(12, "red apple");
        map.put(33, 123);
        System.out.println("map: " + map);
        // 12, 33, 123은 객체 타입이 아니라 정수값인데 왜 가능한가?
        // 리터럴 int가 Integer 객체로(Wrapper 클래스 형태로) 자동으로 boxing 됨
        // 저장한 순서와 무관하게 내부적으로 순서가 정해짐

        /* 키 값은 중복 저장할 수 없다. 새로운 값으로 덮어쓰기 된다. */
        map.put(12, "yello banana");
        System.out.println("map: " + map);
        // 같은 키 값을 가지는 다른 value를 put 했을 때, 내용이 변경됨.(덮어쓰기 됨)

        /* 값 객체는 중복 저장할 수 있다. */
        map.put(9, "yello banana");
        System.out.println("map: " + map);
        // 키는 다르지만 value는 같은 경우, map에 추가됨

        /* 값 객체를 가져올 때 키를 통해 가져온다. */
        System.out.println("key 9에 대한 값 객체 : " + map.get(9));

        /* 키를 통해 값을 삭제한다. */
        map.remove(9);
        System.out.println("map: " + map);

        /* 문자열 키, 값을 갖는 HashMap 생성 */
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("one", "java");
        map2.put("two", "mysql");
        map2.put("three", "jdbc");
        map2.put("four", "html");
        map2.put("five", "css");
        System.out.println(map2);

        /* Map에 저장된 값을 순회하는 방법
        * 1. keySet() */
        // key를 set화 시킴 [key, value] 이렇게 저장되어 있던 것을
        // key 값만 뽑아서 set으로 저장
        // set이 가지고 있는 데이터를 반복할 수 있도록 intertor 사용

        Iterator<String> keyIter = map2.keySet().iterator();
        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = map2.get(key);
            System.out.println(key + " = " + value);
        }

        // 이렇게 향상된 for문으로 써도 된다
        for (String key : map2.keySet()) {
            String value = map2.get(key);
            System.out.println(key + "= " + value);
        }

        /* 2. values() */
        // Map에 key, value 값이 같이 모여있는데, value만 가져옴
        // 단 반환되는 타입이 collection 타입이므로 iterator 사용 가능(iterator는 collection 상속)
        Collection<String> values = map2.values();
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println("value : " + valueIter.next());
        }

        for (String value : map2.values()) {
            System.out.println("value :" + value);
        }

        /* 3. entrySet() */
        // entry : 키 값과 밸류 값을 묶은 것
        // map을 set 형태로 바꾸는 entrySet()
        // set은 제네릭이 하나인데, 그 제네릭이 바로 entry임을 의미함.
        // 키, 밸류 값 모두에 접근 가능함
        Set<Map.Entry<String, String>> set = map2.entrySet();
        Iterator<Map.Entry<String, String>> setIter = set.iterator();
        while (setIter.hasNext()) {
            Map.Entry<String, String> entry = setIter.next();
            System.out.println(entry.getKey() + " + " + entry.getValue());
        }

        // 이렇게도 쓸 수 있다.
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " + " + entry.getValue());
        }
    }
}
