package com.kenny.section01.list.run;

import com.kenny.section01.list.comparator.AscendingPrice;
import com.kenny.section01.list.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* ArrayLisst 사용자 정의 자료형으로 이용하기, 정렬하기 */

        // arraylist의 제네릭 타입을 bookdto로 제한
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 12000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 31000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 43000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 55000));

        for(BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }
        // toString 오버라이드 했는데 왜 레퍼런스 변수 출력 안 되지?(주소값?이 나옴)

        /* Implements Comparable 을 통해 compareTo 메소드(정렬 기준)가 재정의 되어야만 사용 가능하다. */
//        Collections.sort(bookList);
        // String은 compareTo 라는 메소드를 오버라이드해서 어떤 기준으로 정렬할지 정해놓음
        // 그러나 BookDTO는 어떤 기준으로 정렬할지 정해놓지 않음


        // (1) Implements Comparable
        // (2) comparator 인터페이스 구현한 정렬 기준 작성하기
        // 둘 중 하나는 해야 한다 -> comparator.AsecendingPrice

        /* comparator 인터페이스를 구현한 정렬 기준을 작성한다. */
        System.out.println("가격 오름차순 정렬=====");
//        Collections.sort(bookList, new AscendingPrice()); // 이렇게 해도 되고
        bookList.sort(new AscendingPrice());    // 이렇게 해도 된다
        for(BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

        /* 정렬 기준을 계속 사용하는 경우 별도의 클래스를 만들어서 사용해도 되지만
        * 한 번만 사용하기 위해서 더 간편하게 익명 클래스(Amonymous class)를 사용힐 수도 있다. */
        System.out.println("가격 내림차순 정렬=====");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getPrice() - o1.getPrice();
                // 뒤의 숫자가 더 크면 양수 반환
            }
        }); // 인터페이스를 구현하는 익명 클래스 생성 (한 번 쓰고 재사용 x)
        for(BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

        System.out.println("제목 오름차순 정렬 =====");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
//                return o1.getTitle() - o2.getTitle(); // 제목은 이렇게 못 함
                /* 문자열 대소비교는 String 클래스에 정의된 compareTo() 메소드를 활용한다. */
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });
        for(BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

        System.out.println("제목 내림차순 정렬 =====");
        /* implements Comparable<BookDTO> 수행 후에는 해당 코드가 동작된다. */
        Collections.sort(bookList);
        for(BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }
    }
}

// sort는 알고리즘은 구현되어 있지만,
// 내가 만든 클래스는 어떤 기준으로 sort할 지는 정의되어 있지 않기 때문에 정렬이 안 될 수 있음.
// compareTo() 로 내가 가지고 있는 객체와 어떻게 비교할 것인지 (양수, 음수 뭘 반환할 지) 정의해야
// 그게 아니라 여러 정렬 기준이 필요하다면 Comparator 인터페이스를 구현해 compare()로 기준을 전달해줘야 한다.
