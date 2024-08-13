package section01.intro;

@FunctionalInterface
public interface Calculator {

    /* 내부에 하나의 추상 메소드가 선언 된 인터페이스만 람다식의 타깃이 될 수 있다.
     * => 함수적 인터페이스 (Functional Interface)라고 하며 어노테이션으로 체크할 수 있다. */

    // 인터페이스 상단에 어노테이션을 붙여주면 체크 해 줌
    int sumTwoNumber(int a, int b); // Calculator 인터페이스에 추상 메소드 선언

//    int minusTwoNumber(int a, int b);
}
