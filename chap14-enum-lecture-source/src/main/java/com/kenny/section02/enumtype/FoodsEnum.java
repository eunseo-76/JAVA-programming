package com.kenny.section02.enumtype;

public enum FoodsEnum {

    /* 작성 순서대로 0부터 값이 자동으로 부여된다. */
    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),
    DRINK_RADISH_KINCHI_LATTE(3),
    DRINK_WOOLUCK_SMOOTHIEE(4),
    DRINK_RAW_CUTTLEFISH_SHAKE(5); // 원래 없었던 semicolon 추가

    /* 추가적으로 작성하려면 semicolon을 찍고 하단에 작성*/

    private final int value;    // final은 초기화 필요(밑에 생성자 초기화 함)


    private final int var = 10; // 10으로 명시적 초기화

    FoodsEnum(int value) {
        this.value = value;
    }

    public void printVar() {
        System.out.println("print var : " + var);
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();   // this.name() : 각각의 이름
    }
}
