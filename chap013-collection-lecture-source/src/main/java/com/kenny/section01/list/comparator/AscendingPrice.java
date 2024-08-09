package com.kenny.section01.list.comparator;

import com.kenny.section01.list.dto.BookDTO;

import java.util.Comparator;

// (2) Comparator 인터페이스 구현 (Comparator의 추상 메소드를 구현해야한다)

/* Comparator 사용 시 제네릭 선언을 함께 해주어야 compare 메소드의 매개변수 타입이 정의된다.
* Object 타입인 경우 다운 캐스팅해서 시용해야하므로 불편하다. */
// 제네릭 선언를 하지 않으면 자동으로 Obejct로 변환됨
public class AscendingPrice implements Comparator<BookDTO> {

    /* sort() 메소드에서 내부적으로 compare 메소드를 호출하여 swap 여부를 결정한다. */
    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        /* 비교 대상 두 인스턴스의 가격이 오름차순 정렬되기 위해서는 앞의 가격이 더 작은 가격이어야 한다.
        * 만약 뒤의 가격이 더 작은 경우 두 인스턴스의 순서를 바꿔야 한다.
        * 그 때 두 값을 바꾸라는 신호로 양수를 반환하면 정렬 시 순서를 바꾸는 조건으로 사용된다.
        * */
//        int result = 0;
//        if(o1.getPrice() > o2.getPrice()) {
//            result = 1;
//        } else if (o1.getPrice() < o1.getPrice()) {
//            result = -1;
//        }
//
//        return result;

        return o1.getPrice() - o2.getPrice();
    }
}

// 배열을 오름차순으로 정렬하려면
// [3 7 5 2 4]
// 3, 7은 바꿀 필요 x
// 7, 5는 바꿔야 함
// 이런 식으로 바꿀 지 말 지에 대한 부분을 알려줘야 함. 바꾸는 기능은 이미 구현되어 있다.
