package com.kenny.section01.method;

public class Calculator {
    // 메인 메소드가 모든 클래스에 있을 필요는 없다

    public int min(int a, int b){
        // 최소값 확인하는 메소드
        return a < b ? a : b;
    }

    //static 키워드가 있는 메소드
    public static int max(int a, int b){
        // 최대값 확인하는 메소드
        return a > b ? a : b;
    }
}
