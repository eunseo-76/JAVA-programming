package com.kenny.section02.daemonthread;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 일반 스레드는 다른 스레드가 종료 되어도 본인의 작업을 마저 실행한다.
        * 데몬 스레드로 생성한 다른 스레드가 모두 종료되면 함께 종료된다.
        * */

        // Runnable은 functional interface 이므로 Runnable 인터페이스의 구현체 run()을 람다식으로 전달
        Thread t = new Thread(() -> {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        /* setDaetmon() 메소드로 데몬 스레드 설정을 할 수 있으며 start() 이전에 설정해야 한다. */
        t.setDaemon(true);  // 데몬 스레드로 설정
        t.start();

        Scanner sc = new Scanner(System.in);
        System.out.print("카운트 다운을 멈추려면 아무 키나 입력하세요 : ");
        String str = sc.nextLine();
        System.out.println("입력한 값 : " + str);
        System.out.println("main end ==========================");
        // main이 끝나도 카운트 다운하는 스레드는 계속 이어짐
        // 카운트 다운이 다른 스레드의 데몬 스레드로 동작하게 변경(main이 끝나면 종료되도록)
    }
}
