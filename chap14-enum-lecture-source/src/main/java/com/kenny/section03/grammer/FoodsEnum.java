package com.kenny.section03.grammer;

public enum FoodsEnum {

    /* 작성 순서대로 0부터 값이 자동으로 부여된다. */
    MEAL_AN_BUTTER_KIMCHI_STEW(0, "앙버터김치찜"),
    MEAL_MINT_SEAWEED_SOUP(1, "민트미역국"),
    MEAL_BUNGEOPPANG_SUSHI(2, "붕어빵초밥"),
    DRINK_RADISH_KINCHI_LATTE(3, "열무김치라떼"),
    DRINK_WOOLUCK_SMOOTHIEE(4, "우럭스무디"),
    DRINK_RAW_CUTTLEFISH_SHAKE(5, "생갈치쉐이크"); // 원래 없었던 semicolon 추가

    /* 추가적으로 작성하려면 semicolon을 찍고 하단에 작성*/

    private final int value;    // final은 초기화 필요(밑에 생성자 초기화 함)
    private final String name;

    FoodsEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }
    public int getValue() { return value; }
    public String getName() { return name; }
}