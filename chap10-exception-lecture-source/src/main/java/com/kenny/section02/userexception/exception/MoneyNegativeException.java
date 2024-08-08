package com.kenny.section02.userexception.exception;

// Throwable -> Exception -> NegativeException -> MoneyNegativeException
public class MoneyNegativeException extends NegativeException{
    // NegativeException에는 기본 생성자가 없음
    // super(message)가 자동생성되지 않음

    public MoneyNegativeException(String message) {
        super(message);
    }
}
