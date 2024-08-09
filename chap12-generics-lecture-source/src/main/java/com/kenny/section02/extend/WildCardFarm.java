package com.kenny.section02.extend;

public class WildCardFarm {

    // <T extends Rabbit> 어떤 토끼이든 상관 없다
    public void anyType(RabbitFarm<?> farm) {
        farm.getRabbit().cry();
    }

    // 토끼농장 객체가 Bunny 이거나 그 후손 타입이어야 한다
    public void extendType(RabbitFarm<? extends Bunny> farm) {
        farm.getRabbit().cry();
    }

    // 토끼농장 객체가 Bunny 이거나 Bunny보다 부모 타입이어야 한다
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getRabbit().cry();
    }
}

// RabbitFarm 이라는 타입의 객체를 매개변수로 전달받을 때
// <T extends Rabbit> 이라는 제약 조건이 있지만, 메소드로 넘어올 때 어떤 타입이어야 한다는 제약을 줄 수 있음