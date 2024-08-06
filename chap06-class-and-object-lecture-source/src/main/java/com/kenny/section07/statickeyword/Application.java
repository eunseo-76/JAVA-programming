package com.kenny.section07.statickeyword;

public class Application {
    public static void main(String[] args) {
        /* static 키워드에 대해 이해할 수 있다. */

        /* 1. static 키워드를 필드에서 사용 */
        staticFieldTest sft1 = new staticFieldTest();

        sft1.increaseNonstaticCount();
        sft1.increaseStaticCount();

        System.out.println("sft1.getNonstaticCount() = " + sft1.getNonStaticCount());
        System.out.println("sft1.getStaticCount() = " + sft1.getStaticCount());

        // 초기화 되었을 때는 기본값 0
        // 1씩 증가되어 1 출력

        staticFieldTest sft2 = new staticFieldTest();

        sft2.increaseNonstaticCount();
        sft2.increaseStaticCount();

        System.out.println("sft2.getNonstaticCount() = " + sft2.getNonStaticCount());
        System.out.println("sft2.getStaticCount() = " + sft2.getStaticCount());

        // static
    }
}
