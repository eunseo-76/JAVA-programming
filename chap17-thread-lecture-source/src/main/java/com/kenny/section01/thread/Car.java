package com.kenny.section01.thread;

// Thread 상속
public class Car extends Thread{
    @Override
    public void run() {
        /* Car 스레드로 수행할 작업 내용을 작성하는 메소드 */
        for (int i = 0; i < 1000; i++) {
            System.out.println("Car Driving...");

            /* 현재 스레드를 지연 시키는 메소드로 전달 인자로 밀리세컨초를 전달한다. */
            // 천 번은 금방이기 때문에 잠깐 스레드의 동작을 멈추게 함(현재 스레드를 지연시킴)
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // main 메소드는 main 스레드
        // Car 스레드는 main 스레드가 아니라 다른 스레드

    }
}
