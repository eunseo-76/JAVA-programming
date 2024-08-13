package section03.references;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Application1 {
    public static void main(String[] args) {
        /* 메소드 참조에 대해 이해하고 사용할 수 있다. */
        BiFunction<String, String, Boolean> biFunction;
        // String 2개를 전달받아 boolean을 리턴함
        String str1 = "METHOD";
        String str2 = "METHO";

        /* 람다식 사용 */
        biFunction = (x, y) -> x.equals(y);
        boolean result = biFunction.apply(str1, str2);
        System.out.println("result : " + result);

        /* 메소드 참조의 형태로 변경 */
        // 클래스명::메소드명 - String 클래스에 있는 equals 메소드
        // equals : 문자열 매개변수 2개를 받아 true/false 반환 <- 위의 람다식과 동일
        // 이미 존재하는 메소드가 람다식과 동일한 매개변수 형식을 가지고 있다면, 그 메소드를 참조한다
        biFunction = String::equals;
        result = biFunction.apply(str1, str2);
        System.out.println("result : " + result);

        // Predicate : 매개변수를 전달받아 true/false 반환
        Predicate<String> isEqualToSample;
        String sample = "Hello World";

        /* 람다식 사용 */
        isEqualToSample = s -> s.equals(sample);
        result = isEqualToSample.test("Hello World!");
        System.out.println("result : " + result );

        /* 메소드 참조의 형태로 변경 */
        // 레퍼런스 변수 명 sample :: equals
        // 비교할 문자열(sampl)을 고정하고, 넘어오는 문자열을 sample과 비교해서 true, false 리턴함
        isEqualToSample = sample::equals;
        result = isEqualToSample.test("Hello World!");
        System.out.println("result : " + result );
    }
}
