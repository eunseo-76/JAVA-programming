package com.kenny.section03.math;

public class Application1 {
    public static void main(String[] args) {
        /* Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */
        /* java.lang 패키지의 하위 기능은 매우 자주 사용되는 기능들이 있어 컴파일러가 자동으로
        * import java.lang.* : 코드를 추가한다.
        * */

        /* 1. 절대값 */
        System.out.println(java.lang.Math.abs(-7));
        // ctrl + 클래스 클릭

        /* 2. 최대값, 최소값*/
        // java.lang 없이 Math.min만 해도 에러가 발생 안 하는 이유?
        // 다른 패키지에 있는 메소드를 사용하려면 패키지 이름을 써야 함에도 불구하고
        System.out.println(Math.min(10, 20));
        System.out.println(Math.max(10, 20));

        // String도 java.lang 하위의 메소드
        String str;

        /* 3. 난수 출력 */
        System.out.println(Math.random());  //Math.random() : 0 이상 1 미만의 '실수'
    }
}
