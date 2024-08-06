package com.kenny.section01.extend;

public class Application {
    public static void main(String[] args) {
        /* Car 인스턴스 테스트 */
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /* 소방차, 레이싱카는 모두 자동차이다.
        * FireCar is a Car.
        * RacingCar is a Car.
        * => IS-A 관계가 성립하는 경우 상속을 사용할 수 있다.
        *  */

        /* FireCar 인스턴스 테스트 */
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        // 셍성자는 상속이 안 된다고 했는데 왜 상속될까?

        /* FireCar 클래스에서는 아무것도 작성하지 않아도 Car 클래스의 메소드를 상속받아 모두 사용할 수 있다.
         * 하지만 자식 클래스에 맞게 다르게 기능하게끔 오버라이딩(재작성) 해서 사용할 수도 있다.
         * 또는 추가적인 기능을 정의하여 부모 클래스를 확장할 수도 있다.
         */

        fireCar.sprayWater();
//        car.sprayWater(); // -> 부모는 자식의 멤버에 접근해서 사용할 수 없다.

        // firecar -> car 이므로 firecar에
        /* RacingCar 인스턴스 테스트 */
        // 기본 생성자를 명시적으로 만들지 않으면 컴파일러가 알아서 작성, 그리고 컴파일러는 super를 자동으로 넣기 때문에 부모의 것을 가져옴
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();

        /* 레이싱카의 경우 경적소리를 내는 것이 적합하지 않지만 Car를 상속받았기 때문에 어쩔 수 없이 해당 기능을 가지게 됨.
        * 상속 구조로 인해 불필요한 기능이 추가될 수도 있다.
        * */
    }
}
