package com.kenny.section02.set;

import java.io.ObjectInputStream;
import java.io.StringReader;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* HashSet 클래스를 이해하고 사용할 수 있다. */
        HashSet<String> hset = new HashSet<>();
        // hashset은 set 인터페이스를 구현.
        // set은 collection 인터페이스를 상속받음. 즉 hashset은 collection, set의 특성을 가진다.

        /* 다형성을 적용하여 상위 인터페이스 타입을 사용 가능 */
        Set<String> hset2 = new HashSet<>();
        Collection<String> hset3 = new HashSet<>();

        // collection 인터페이스를 list, set이 implement함.
        // 즉 list <-> set 이렇게 치환하는 기능도 있을 것이다...

        /* Set 계열에 데이터 추가 시 add() 메소드 사용 */
        hset.add(new String("java"));   //(1)
        hset.add(new String("mysql"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        /* 저장 순서가 유지되지 않는다. (내부적인 해시 연산의 결과로 저장된다. */
        System.out.println("hset : " + hset);   // add 순서와 무관하게 저장됨

        /* 중복 값이 저장되지 않는다.
        * 동일 객체 뿐 아니라 동등 객체도 중복 값으로 판단하여 처리한다.
        * String 클래스에 hashCode(), equals() 가 오버라이딩 되어 있기 때문이다.
        * */
        hset.add(new String("java"));   //(2)
        System.out.println("hset : " + hset);   // java는 이미 있으므로 저장되지 않음

        // 동일 객체 : 주소값이 같음.
        // 동등 객체 : 필드값이 같음
        // (1)과 (2)는 주소값이 다르지만 필드값이 다른 동등 객체.
        // new String에 hashCode()와 equals()가 오버라이딩 되어있기 때문에 중복 객체 판단이 가능하다.

        // Student 객체를 만들었다고 가정. Student를 HashSet<Student> set으로 관리한다면.
        // 동등 객체에 대한 중복 검사가 가능하다.

        /* 해당 객체 포함 여부를 동등 객체 기준으로 판단한다.
        * 내부적으로 equals() 메소드를 호출해서 사용한다.*/
        System.out.println(hset.contains(new String("html")));
        // 주소값 기준이 아니라 필드값 기준으로 포함되었는지 판단

        /* 저장된 객체를 인덱스 기준으로 순회할 수 없다.
        * 반복문을 통한 연속 처리 방법 */
        // Set은 인덱스, 위치가 없음. 처음부터 끝까지 순회하려면

        // hset의 데이터를 배열로 만듦. Object 타입의 배열에 넣음.
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " :" + arr[i]);
        }

        // iterator : collection 계열이면 누구나 가지고 있음.
        /* Collectino 인터페이스 사우이 타입인 Iterable 인터페이스에 iterator() 메소드가 정의되어 있다.
        * 따라서 Collection 타입이라면 반복자(Iterator)를 통한 순회가 가능하다. */
        Iterator<String> it = hset.iterator();
        // iterator : 반환할 값이 있으면 해당 값을 반환
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String s : hset) {
            System.out.println(s);
        }

    }
}
