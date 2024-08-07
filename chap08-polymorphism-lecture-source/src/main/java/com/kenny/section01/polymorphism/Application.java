package com.kenny.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        /* Rabbit은 Rabbit 이기도 하지만 Animal 이기도 하다.
        * Tiger는 Tiger 이기도 하지만 Animal 이기도 하다.
        *  */
        // rabbit [  animal[ object[ ]  ]   ] 이렇게 구성됨

        /* 부모 타입의 레퍼런스 변수로 자식 인스턴스의 주소 값 참조가 가능하다. */
        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        /* 자식 타입의 레퍼런스 변수로 부모 타입의 인스턴스 주소 값 참조는 불가능하다. */
//        Rabbit r1 = new Animal();
//        Tiger t1 = new Animal();

        // Parent p = new Child();

        /* 컴파일 당시에는 해당 타입의 메소드와 연결 되어 있다가 (정적 바인딩)
        * 런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작 (동적 바인딩)
        * */

        // 바인딩 : 이 코드를 만나면 어떤 메소드에 있는 코드를 실행할게요 ~ 라고 연결해놓는 것
        // 어떤 메소드를 호출할 지 연결 해 놓는 것
        // animal 처럼 보이지만 실제 인스턴스는 rabbit, tiger이기 때문에 오버라이딩 된 cry를 가리킴
        a1.cry();
        a2.cry();

        /* 현재 레퍼런스 변수 타입은 Animal 이기 때문에 Rabbit, Tiger의 메소드를 호출 할 수 없다 */
//        a1.jump();
//        a2.bite();

        /* 형변환을 통해 호출 */
        ((Rabbit)a1).jump();  // 형변환 연산자보다 참조 연산자가 우선순위가 더 높다
        ((Tiger)a2).bite();

        // animal을 가리키는 레퍼런스 변수
        // 레퍼런스 변수 ------------ rabbit [ --> animal[       ]        ]
        // rabbit을 가리키게 바꿔줌
        // 레퍼런스 변수 ------------> rabbit [animal[       ]            ]

        /* 타입 형변환을 잘못 하는 경우 ClassCastExcetion 발생 */
//        ((Tiger)a1).bite(); // 잘못된 형변환
        //컴파일 에러는 발생 x, 런타임 에러 ClassCastException 발생

        // 이런 발생하지 않게 미리 확인하는 법
        /* 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 instanceof 연산자 */
        System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
        System.out.println("a2가 Rabbit 타입인지 확인 : " + (a2 instanceof Rabbit));
        System.out.println("a2가 Tiger 타입인지 확인 : " + (a2 instanceof Tiger));

        /* 상속 받은 타입도 가지고 있다. */
        System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
        System.out.println("a2가 Animal 타입인지 확인 : " + (a2 instanceof Animal));

        /* 모든 클래스는 Object의 후손이다. */
        System.out.println("a1이 Object 타입인지 확인 : " + (a2 instanceof Object));
        System.out.println("a2가 Object 타입인지 확인 : " + (a2 instanceof Object));

        // 레퍼런스 변수(주소값이 담겨있는 변수) instanceof 타입

        /* 해당 타입이 맞는 경우에만 클래스 형변환을 수행 */
        if(a1 instanceof Rabbit) ((Rabbit)a1).jump();
        if(a2 instanceof Tiger) ((Tiger)a2).bite();

        /* up-casting : 상위 타입으로 형변환 (묵시적. 자동형변환 가능)
        * down-casting : 하위 타입으로 형변환 (강제형변환 해야 함)
        * */

        // rabbit 타입의 인스턴스를 animal 타입에 참조시킴
        // rabbit -> animal로 형변환 이므로 up-casting
        Animal animal1 = (Animal) new Rabbit(); // (Animal) 없어도 됨
        Animal animal2 = new Rabbit();

        // animal 타입 -> rabbit 이므로 down-casting
        // 형 변환 연산자 필수
        Rabbit rabbit1 = (Rabbit) animal1;
//        Rabbit rabbit2 = animal1;


    }
}
