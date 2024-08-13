package com.kenny.section01.intro;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Application1 {
    /* Stream에 대해 이해하고 사용할 수 있다. */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("hello", "stream", "world"));
        // 평소에는 new ArrayList(); 기본 생성자를 호출
        // 여기서는 Collection 타입의 값을 전달
        // Arrays의 asList 메소드 : 매개변수로 특정 타입을 가변인자로(여러 개 가능) 받고 그 타입의 ArrayList를 만들어 리턴
        // => 3개 문자열을 String 타입의 ArrayList로 만들고 초기값으로 지정

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();   // iterator에 다음 값이 있으면 반복
            if (str.equals("stream")) {
                System.out.println("걸러낸 값 : " + str);
            }
        }
        // 이렇게 하는 대신 stream을 사용하면 더 간결하게 가능

        /*iterator 객체는 이미 모두 사용되었으므로 반복문은 동작하지 않으며
        * 필요하다면 새로운 Interator 객체를 만들어야 한다. */

        while(iterator.hasNext()) {
            String str = iterator.next();
            System.out.println("반복문 : " + str); // 여기 반복문에는 들어가지 않음
        }

        /* Iterator 대신 Stream의 기능을 활용 */
        list.stream().filter("stream"::equals).forEach(str -> System.out.println("걸러낸 값 : " + str));
        // list.stream() : list를 stream으로 변환
        // filter() : predicate<? super T> predicate
        // "stream"::equals : list 안에 담긴 hello, stream, world를 돌리면서 stream과 같은 지 확인
        // forEach : 반복문을 통한 출력.

        // list.stream()
        //Stream : 은 list에서 값을 가져온 것으로, List와 는 별도의 객체임
    }
}
