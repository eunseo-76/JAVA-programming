package com.kenny.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        // 최종 연산

        /* 스트림의 최종 연산 중 하나인 calculating에 대해 이해하고 사용할 수 있다. */
        long count = IntStream.rangeClosed(1, 10).count();
        long sum = IntStream.rangeClosed(1, 10).sum();

        System.out.println("Sum : " + sum);
        System.out.println("Count : " + count);

        /* 결과 없음을 나타내는 명확한 요구가 있는 메소드의 반환 형식으로는 OptionalInt 사용 */
        OptionalInt max = IntStream.rangeClosed(1, 10).max();
        OptionalInt min = IntStream.rangeClosed(1, 10).min();

        System.out.println("Max : " + max);
        System.out.println("Max : " + max.getAsInt());
        System.out.println("Min : " + min);
        System.out.println("Min : " + min.getAsInt());

        // Optional 타입
        // NullPointerException : 참조할 레퍼런스 변수가 null일 때(주소값이 담겨있지 x)
        // null 인지 아닌지 체크하기 위해 만든 게 Optional 타입

        // long count = IntStream.rangeClosed(1, 10).count(); <- 여기서 아무것도 안 담긴 경우,
        // max(), min()을 0이 아니라 결과 없음으로 나타내기 위해 Optional을 사용
        // OptionalInt[10] 이런 식으로 나오고, 실제 값을 꺼내려면 getAsInt()를 사용한다.

        /* 중간 연산 이후 최종 연산을 수행 */
        int oddSum = IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 1)    // 중간 연산 (홀수만 남기겠다)
                .sum();
        System.out.println("OddSum : " + oddSum);
        // 최종 연산이 수행되면 스트림이 닫힌다
    }
}
