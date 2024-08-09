package com.kenny.section01.generic;

public class Application {
    public static void main(String[] args) {
        /* generic : 사전적 의미로는 일반적인. 자바에서 제네릭은 데이터 타입을 일반화 한다는 의미이다. */

        /* 제네릭 프로그래밍 : 데이터 형식에 의존 없이 여러 다른 데이터 타입을 가질 수 있는 기술로
        * 재사용성을 높일 수 있다.
        * 컴파일 시 미리 타입 검사를 하여 객체의 타입 안정성을 높이고,
        * 반환 값에 대한 타입 변환 및 타입 검사에 들어가는 코드도 생략이 가능해진다.
        * */
        // 어떤 타입이든 기능할 수 있는 클래스를 만들 수 있음.

        // 제네릭 문법을 안 쓰고, T가 아니라 상위 타입인 Object여도 타입에 관계 없이 할 수 있는데 제네릭을 쓰는 이유
        // 컴파일 시점에 어떤 값을 넣을지 결정함. (Integer 쓸 거예요~) 그리고 해당 타입이 아니면 들어가지 못 하게 함(타입 검사)
        // Object를 하면 뭐가 들어가도 상관없음.

        /* 타입을 Integer로 하여 인스턴스 생성 */
        GenericTest<Integer> gt1 = new GenericTest<>();
        gt1.setValue(10);
//        gt1.setValue("Hello World!");
        Integer num = gt1.getValue();

        /* 타입을 String으로 하여 인스턴스 생성 */
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("Hello");
//        gt2.setValue(10);
        String str = gt2.getValue();

        /* 제네릭 없이 인스턴스 생성 */
        // 오류는 안 남. 타입이 결정되어 있지 않기 때문에 아무 타입이나 들어감.
        GenericTest gt3 = new GenericTest();
        gt3.setValue("Hello");
        gt3.setValue(10);
        // Object가 반환되어 강제로 Integer로 형변환을 해야 함.
        Integer num2 = (Integer) gt3.getValue();

    }
}
