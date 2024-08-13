package section01.intro;

public class Application2 {
    public static void main(String[] args) {
        /* 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다. */

        // 외부 인터페이스.내부 인터페이스 이름 = (매개변수) -> (리턴값)
        OuterInterface.Sum sum = (x, y) -> x + y;
        OuterInterface.Minus minus = (x, y) -> x - y;
        OuterInterface.Multiple multiple = (x, y) -> x * y;
        OuterInterface.Divide divide = (x, y) -> x / y;

        System.out.println(sum.sumTwoNumber(20, 10));
        System.out.println(minus.minusTwoNumber(20, 10));
        System.out.println(multiple.multipleTwoNumber(20, 10));
        System.out.println(divide.divideTwoNumber(20, 10));
    }
}
