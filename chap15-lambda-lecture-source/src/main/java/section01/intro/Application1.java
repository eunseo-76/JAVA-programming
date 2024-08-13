package section01.intro;

public class Application1 {
    public static void main(String[] args) {
        /* 람다식에 대해 이해하고 사용할 수 있다. */

        /* 인터페이스에 정의 된 추상 메소드를 활용하는 방법. */

        /*1. 인터페이스를 상속 받은 클래스를 정의하여 기능을 완성한 뒤 사용 */

        Calculator c1 = new CalculatorImpl();
        System.out.println(c1.sumTwoNumber(10, 20));

        // 한 번만 사용할 거라 클래스를 만들 필요가 없을 때 사용하는 익명 클래스

        /* 2. 익명 클래스를 사용하는 방법 */
        // 자동완성에서 Calculator {...} 인터페이스 클릭
        Calculator c2 = new Calculator() {
            // 몸체만 있는 이름 없는 하나의 클래스를 만듦
            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;
            }
        };
        System.out.println(c2.sumTwoNumber(20, 30));

        /* 3. 람다식을 이용한 방법 */
        // 익명 클래스 말고 람다식을 사용할 수 있다.

        Calculator c3 = (a, b) -> a + b;
        System.out.println(c3.sumTwoNumber(30, 40));
        // Calculator라는 인터페이스를 완성하기 위해 하나의 추상 메소드가 완성 되어야 함.
        // (int a, b 매개변수) -> 반환값;
        // 제약 : 만약 Calculator 인터페이스에 구현해야 할 추상 메소드가 하나 더 있다면 람다식 이용 불가


    }
}
