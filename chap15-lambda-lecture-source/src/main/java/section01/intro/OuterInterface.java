package section01.intro;

/* 람다식 사용을 위해 인터페이스 내에 하나의 추상 메소드만 작성할 수 있으므로
* 관리 인터페이스가 너무 많아질 수 있다. 이 때 내부 인터페이스를 활용할 수 있다. */
// 인터페이스 안에 추상 메소드 하나씩만 적다보면 인터페이스가 너무 많아질 수 있음
public interface OuterInterface {
    //인터페이스를 감싸는 외부 인터페이스

    @FunctionalInterface
    interface Sum {
        int sumTwoNumber(int a, int b); // 추상 메소드 1개
    }

    @FunctionalInterface
    interface Minus {
        int minusTwoNumber(int a, int b);
    }

    @FunctionalInterface
    interface Multiple {
        int multipleTwoNumber(int a, int b);
    }

    @FunctionalInterface
    interface Divide {
        int divideTwoNumber(int a, int b);
    }
}
