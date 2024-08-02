package com.kenny.section01.array;

public class Application2 {
    public static void main(String[] args) {
        /* 배열의 선언
        *  -> 선언은 stack에 배열의 주소를 보관할 레퍼런스 변수 공간을 만드는 것 */
        int[] iarr;  // 문법적으로 둘 다 맞지만 JAVA에서는 이쪽이 좀 더 보편적
        double darr[];

        /* 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소 값을 반환한다.
        * 발생한 주소가 레퍼런스 변수(참조형 변수)에 저장 되고 이것을 참조하여 사용하기 때문에
        * 참조 자료형이라고 한다.*/

        // String str = "hello";
        // str은 레퍼런스 변수이고, "hello" 값이 저장된 공간의 주소값을 저장하고 있다.

        // Char ch = 'a';
        // char와 같은 8가지 기본 자료형은 ch에 실제 값을 가지고 있음. 참조 자료형 아님!
        // 기본 자료형 8가지가 아니면 모두 참조 자료형

        iarr = new int[5];
        darr = new double[10];

        /* heap 메모리는 이름으로 접근하지 않고 주소로 접근하는 영역이다.
        * stack에 저장 된 주소로 heap에 할당 된 배열을 찾아갈 수 있다. */
        System.out.println("iarr = " + iarr);
        System.out.println("darr = " + darr);
        // stack에 있는 레퍼런스 변수를 있는 그대로 출력하면 주소값이 출력됨
        //[I@23fc625e : int type + 주소값

        /* hashCode() : 객체의 주소 값을 10진수로 변환하여 생성한 객체의 고유 정수값 반환 메소드 */
        System.out.println("iarr.hashCode() = " + iarr.hashCode());
        System.out.println("darr.hashCode() = " + darr.hashCode());
        // 주소값을 hash 연산 해 10진수로 반환

        /* 배열의 길이를 알 수 있는 필드를 제공한다.
        * String 클래스의 문자열의 길이는 메소드를 제공하므로 length()로 사용하는 점에 유의한다. */
        System.out.println("iarr.legnth = " + iarr.length);
        System.out.println("darr.legnth = " + darr.length);

        /* 한번 지정한 배열의 길이는 변경하지 못하므로
        * 새로운 배열을 생성하여 그 주소값을 레퍼런스 변수에 덮어 쓴다. */
        iarr = new int[100];
        iarr = null;    // 참조하는 주소 값이 없음을 나타냄.
        // 이 레퍼런스 변수가 참조하는 주소 값이 없다 = 원래 연결되어 있던 공간과 연결이 끊어짐 = 나중에 삭제 됨

        /* java.lang.NullPointerException 발생
        * null 이라는 특수 값을 참조하고 있을 경우 참조 연산자를 사용하면 발생하는 에러 */

        // . : 참조 연산자
        // null인 iarr을 참조하면 NullPointerException이 발생한다!
        System.out.println("수정 된 iarr.hashCode() = " + iarr.hashCode());
        System.out.println("수정 된 iarr.length = " + iarr.length);

        // arr은 0x1234부터 시작하는 5개짜리 공간이었는데,
        // 0x5678로 시작하는 100개짜리 공간으로 덮어씀(원래 0x1234로 이어지던 연결이 끊김!)

        // 그럼 원래 0x1234... 공간은 어떻게 될까?
        // JVM이 동적 메모리 공간 관리함. JAVA는 개발자가 아니라 JVM이 함.
        // 이렇게 더이상 사용하지 않는 공간은 가비지 컬렉터가 청소함. (즉시는 아니고 old 영역으로 바뀐 것만)

        /* 한 번 할당 된 배열은 지울 수 없다.
        *  단, 참조 되지 않은 배열은 시간이 지난 후 old 영역으로 이동하여 GC(가비지 컬렉터)가 삭제한다.
        *  주소 값을 잃어버린 배열은 재참조가 불가능 하다.*/

        // NullPointerException :  이 공간은 아무런 배열도 참조 하지 않는다. null 값을 가진다.
        // 길이, 배열의 값 등을 물어보는 게 불가능하다. 이 오류가 발생하면 레퍼런스 변수 값이 null로 되어있음을 알 수 있다.


    }
}
