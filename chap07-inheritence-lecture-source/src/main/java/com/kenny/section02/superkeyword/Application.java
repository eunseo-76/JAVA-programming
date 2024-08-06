package com.kenny.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /* super, super()에 대해 이해할 수 있다. */

        /* Product 기본 생성자*/
        Product product1 = new Product();
        System.out.println(product1.getInformation());

        /* Product 매개변수 생성자 */
        Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴드2", 2389000, new Date());
        System.out.println(product2.getInformation());

        /* Computer 기본 생성자 */
        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());
        // 상속 했기 때문에 computer 생성자 호출 이전에 부모 생성자 호출 일어남

        /* Computer 매개변수 생성자 */
        Computer computer2 = new Computer("퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer2.getInformation());

        /*Product, Computer 모든 필드 초기화 생성자 */
        Computer computer3 = new Computer("S-01234", "삼성", "갤럭시Z폴드2", 2389000, new Date(), "퀄컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInformation());
        // super() 호출하면서 나머지도 초기화했기 때문에 전부 값이 나옴
    }
}
