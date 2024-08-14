package com.kenny.section01.thread;

public class Application {
    public static void main(String[] args) {
        /* Thread를 생성하는 방법
        * 1. Thread 클래스 상속
        * 2. Runnable 인터페이스 구현
        * */

        Thread t1 = new Car();
        Thread t2 = new Tank();
        Thread t3 = new Thread(new Plane());
        // Runnable을 implement 했기 때문에 Thread 타입이 아님. 전달 인자로 어떤 Runnable 타입을 넘겨줄 건지 작성해야 함

        /* 기본적으로 가지고 있는 우선순위 */
        System.out.println("t1 우선순위: " + t1.getPriority());
        System.out.println("t2 우선순위: " + t2.getPriority());
        System.out.println("t3 우선순위: " + t3.getPriority());

        /* 우선순위 변경 */
        t1.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1 우선순위: " + t1.getPriority());
        System.out.println("t2 우선순위: " + t2.getPriority());
        System.out.println("t3 우선순위: " + t3.getPriority());
        // 우선순위를 변경했다고 t1만 먼저 동작하지는 않는다.
        // 여러 개 cpu를 사용하는 환경이기 때문에 우선순위를 가지고 수행하지 않고, 각각 수행된다
        // 하나의 cpu에서 여러 스레드를 진행할 때 스케줄링이 유효하다.



        /* run() 메소드 호출 시 별도의 스레드로 동작하지 않고 메인 스레드가 메소드를 호출하는 방식으로 동작한다. */
//        t1.run();
//        t2.run();
//        t3.run();
        // car -> tank -> plane 순으로 진행 (싱글 스레드로 동작하는 모습 관찰 가능)
        // main 호출 -> main 안에서 t1 호출 -> t1 종료 후 main 으로 돌아옴 -> t2 호출 -> t2 종료 후 main 으로 돌아옴 -> t3 호출 -> t3 종료 후 main 으로 돌아옴
        // 스레드 생성 시 run() 호출하면 main 스레드에서 호출한다는 뜻. 올바른 방식이 아님.
        // 스레드로 호출하려면 start() 호출해야함. 그럼 main 과 별개의 스레드가 생성되어 병렬적으로 동작 가능.

        /* start() 메소드 호출 시 별도의 호출 스택을 생성하여 각각의 스레드가 동작한다. */
        t1.start();
        t2.start();
        t3.start();

        /* 지정 스레드가 종료될 때까지 현재 스레드의 종료를 대기시킬 수 있다. */
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread end ====================");
        // 이 동작은 main 스레드가 함.
        // main 스레드의 호출이 가장 먼저 동작하고 스레드들이 동작한다는 걸 알 수 있음.
        // 경우에 따라서는 이 동작이 다른 스레드의 동작 이후에 일어나게 하고 싶을 수도 있다. -> join() 메소드 사용
    }
}

// 상속 관계 : Runnable 인터페이스 <-- Thread 클래스
// 방법 2가지
// (1) Runnable <--- Thread <---- 나 : Runnable을 상속받는 Thread를 상속받기 -- t1, t2
// (2) Runnable <---- 나 : Runnable 이인터페이스를 구현하기 --- t3