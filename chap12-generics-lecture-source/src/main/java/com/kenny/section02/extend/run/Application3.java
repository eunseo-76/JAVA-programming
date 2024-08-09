package com.kenny.section02.extend.run;

import com.kenny.section02.extend.*;

public class Application3 {
    public static void main(String[] args) {
        /* 와일드 카드에 대해 이해할 수 있다. */

        WildCardFarm wf = new WildCardFarm();

        /* 1. 매개변수 타입 제한이 없는 경우 => 어떤 토끼를 가진 토끼 농장이던 인자로 전달 가능 */
        //토끼농장이라는 객체를 전달. 토끼농장은 어떤 토끼를 넘기느냐.
        wf.anyType(new RabbitFarm<>(new Rabbit()));
        wf.anyType(new RabbitFarm<>(new Bunny()));
        wf.anyType(new RabbitFarm<>(new DrunkenBunny()));

        /* 매개변수 타입이 바니이거나 바니 후손 토끼를 가진 토끼 농장만 인자로 전달 가능 */
//        wf.extendType(new RabbitFarm<>(new Rabbit()));
        wf.extendType(new RabbitFarm<>(new Bunny()));
        wf.extendType(new RabbitFarm<>(new DrunkenBunny()));

        /* 3. 매개변수 타입이 바니이거나 바니 상위 타입 토끼를 가진 토끼 농장만 인자로 전달 가능 */
        wf.superType(new RabbitFarm<>(new Rabbit()));   // 이렇게 하면 상위 타입으로 추론이 가능해서
        wf.superType(new RabbitFarm<>(new Bunny()));
        wf.superType(new RabbitFarm<>(new DrunkenBunny()));

        // 이 부분 깃헙 보기

        // supertype은 bunny 이거나 bunny 위
        // rbbitfarm은 rabbit을 상속하기만 하면 된다고 설정함
        // rabbitfarm이 가지는 타입을 <> 안에 명시를 안 함. 그러면 drnkenbunny로 설정 안 하고 rabbit 타입으로 추론해버림
        // 구체적으로 DrunkenBunny 라고 쓰면 컴파일 에러가 난다!
    }
}
