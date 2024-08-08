package com.kenny.section02.userexception.exception;

// Exception을 상속 받는다 -> Exception의 모든 기능 사용 가능
public class NegativeException /**/extends Exception/**/ {

    // 어떤 exception인지 전달받기 위한 생성자
    public NegativeException(String message) {
        super(message);// 상위 타입의 생성자에 보내줌
        // Exception 자체도 Throwable에 message를 보내줌
    }
}
