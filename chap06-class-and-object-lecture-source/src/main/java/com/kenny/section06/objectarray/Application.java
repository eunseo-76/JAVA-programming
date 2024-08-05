package com.kenny.section06.objectarray;

public class Application {
    public static void main(String[] args) {
        /* 객체 배열에 대해 이해할 수 있다. */

        // 자동차 여러 대를 하나의 배열에서 관리하기
        Car[] cars = new Car[5];
        // stack에 cars 레퍼런스 변수 공간 있고, heap 공간에 참조 자료형 배열 공간 있음
        // 자동차 배열 5개를 만든 게 아니라, 참조할 수 있는 공간만 만든 것!

        /* cars의 각 인덱스는 기본 값 null로 초기화 되어 있기 때문에 인덱스별로 인스턴스를 생성해야 한다. */
        // 이렇게 해야 자동차 객체가 생성된 것!
        cars[0] = new Car("페라리", 300);
        cars[1] = new Car("람보르기니", 300);
        cars[2] = new Car("롤스로이스", 300);
        cars[3] = new Car("부가티베이론", 300);
        cars[4] = new Car("포터", 300);

        /* 배열은 반복문을 통해 일괄 처리가 가능하다는 장점이 있다. */
        for (int i = 0; i < cars.length; i++) {
            cars[i].driveMaxSpeed();
        }

        for (Car car : cars) {
            car.driveMaxSpeed();
        }

        /* 객체 배열도 할당과 동시에 초기화할 수 있다. */
        Car[] cars2 = {
                new Car("페라리", 300),
                new Car("람보르기니", 300),
                new Car("롤스로이스", 300),
                new Car("부가티베이론", 300),
                new Car("포터", 200)
        };

        for (Car car : cars2) {
            car.driveMaxSpeed();
        }
    }
}
