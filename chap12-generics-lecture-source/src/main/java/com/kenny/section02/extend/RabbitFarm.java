package com.kenny.section02.extend;

// <T extends Rabbit> : Rabbit을 상속받고 있는 것만 들어올 수 있다
public class RabbitFarm <T extends Rabbit> {

    private T rabbit;

    public RabbitFarm() {}

    // rabbit을 받아서 초기화
    public RabbitFarm(T rabbit) {
        this.rabbit = rabbit;
    }

    public T getRabbit() {
        return rabbit;
    }

    public void setRabbit(T rabbit) {
        this.rabbit = rabbit;
    }
}
