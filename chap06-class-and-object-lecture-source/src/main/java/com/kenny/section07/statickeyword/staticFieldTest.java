package com.kenny.section07.statickeyword;

public class staticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    /* 두 필드의 값을 1씩 증가시키는 메소드 */
    public void increaseNonstaticCount() {
        this.nonStaticCount++;  // 인스턴스(객체)의 주소 값을 통해 접근
    }

    public void increaseStaticCount() {
        staticFieldTest.staticCount++;  // 클래스명을 통해 접근
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }
    public int getStaticCount() {
        return staticFieldTest.staticCount; // 같은 클래스 내이기 때문에 클래스명(staticFieldTest) 생략 가능
    }
}
