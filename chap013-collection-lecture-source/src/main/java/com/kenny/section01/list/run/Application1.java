package com.kenny.section01.list.run;

import java.sql.Array;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* ArrayList
         * 배열의 단점을 보완. 배열은 크기 변경 불가, 요소의 추가/삭제/정렬 등이 복잡.
         * 이러한 기능을 메소드로 구현해서 제공하고 있으며 속도가 빨라지는 것은 아니다.
         * */
        // 장점 1. 크기 변경 가능
        // 장점 2. 중복 저장 가능

        // 배열은 중간 값을 삭제하면 그만큼 뒤에 있는 값들을 앞으로 당겨줘야 함.
        // 이런 기능을 메소드로 미리 구현해둔 게 ArrayList.
        // 컬렉션 : 미리 만들어진 자료구조를 제공해주는 API

        /* 다형성을 이용해서 상위 레퍼런스로 ArrayList 객체를 참조할 수 있다.
         * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하므로
         * 상위 타입으로 선언하는 것이 더 유연한 코드를 작성하는 방법이다. */
        ArrayList alist = new ArrayList();  // 이것보다
        List list = new ArrayList();    // 이게 낫다
        Collection clist = new ArrayList(); //리스트가 컬렉션을 상속받으므로(?) 가능

        // List는 인터페이스 : List는 이런 기능들이 필요할 거라고 추상 메소드를 정의해 놓음
        // ArrayList : List 인터페이스를 구현하는 클래스.

        // 컬렉션 인터페이스를 리스트 인터페이스가 상속받고 있음(인터페이스 - 인터페이스 사이에서는 extends 사용)

        /* add 메소드를 통해 element(요소)를 저장할 수 있고 현재는 Object 하위 타입 모두를 저장할 수 있다. */
        alist.add("apple");
        alist.add(123);
        alist.add(45.67);
        alist.add(new Date());

        /* 저장 순서가 유지되며 index(순번)이 적용된다. */
        // add를 호출한 순서대로 데이터가 저장되어있다.
        System.out.println("alis : " + alist);  // 레퍼런스 변수 출력

        /* 배열의 크기가 아니라 저장된 요소의 개수를 반환한다.
        * 내부 관리 배열의 사이즈는 외부에서 알 필요가 없으므로 기능으로 제공하지 않는다. */
        System.out.println("alist.size() : " + alist.size());
        // 내부적으로는 배열로 관리를 함. 하지만 배열의 크기가 아니라 요소의 개수를 알려준다.

        for (int i = 0; i < alist.size(); i++) {
            /* get 메소드에 index를 전달하여 하나의 요소에 접근 가능하다. */
            System.out.println(i + " : " + alist.get(i));
        }

        /* 데이터의 중복 저장 */
        alist.add("apple");
        System.out.println("alist : " + alist);
        // 처음의 apple과 여기서 추가한 apple은 같은 apple을 가리키고 있어 주소값이 같지만, 인덱스로 구분이 가능하다

        /* 원하는 위치에 값을 추가할 수 있다. */
        alist.add(1, "banana");
        System.out.println("alist : " + alist);

        /* 저장된 값을 삭제할 때는 remove() */
        alist.remove(2);
        System.out.println("alist : " + alist);

        /* 지정된 위치의 값 수정 */
        alist.set(1, true);
        System.out.println("alist : " + alist);

        /* 모든 컬렉션 프레임워크는 제네릭 클래스로 작성되어 있다. */
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
//        stringList.add(123);    // List<String> 으로 제네릭이 선언이 되어 있기 때문에 정해진 타입만 가능

        /* 저장 순서대로 유지 된 리스트*/
        System.out.println("stringList : " + stringList);   // 정렬 전
        Collections.sort(stringList);       // 문자열 오름차순
        System.out.println("stringList : " + stringList);

    }



}

