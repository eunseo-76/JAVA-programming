package com.kenny.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 매개변수에 활용할 수 있다. */
        Application3 app = new Application3();
        app.feed(new Rabbit());
        app.feed(new Tiger());
    }
    /* 다형성을 적용하지 않으면 각 동물별로 먹이를 주는 메소드가 작성되어야 하며
    * 동물의 종류가 늘어나면 추가 메소드 정의가 필요하다.
    * 지금은 Animal 이라는 상위 타입으로 정의했기 때문에 동물이 추가되어도 동일 메소드를 활용할 수 있다. */
    public void feed(Animal animal) {animal.eat();}
    // 특정 동물에게 먹이를 주는 게 아니라, 상위 타입으로 적음
    // 그러나 특정 동물로 넘겨줘도 된다
    // 동적 바인딩이 된다 ~
    // 만약 feed 메소드에 rabbit, tiger를 적었다면, 동물이 추가될 때마다 메소드를 계속 추가해야함.
    // 상위 타입으로 적으면 동물들이 얼마가 추가되더라도 ok
}
