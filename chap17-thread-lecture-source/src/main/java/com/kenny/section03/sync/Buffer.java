package com.kenny.section03.sync;

public class Buffer {
    private int data;
    private boolean empty = true;

    public synchronized void getData() {

        if (empty) {
            System.out.println("getData wait");
            try {
                /* 실행 중인 스레드를 일시 정지 시킨다. 다른 스레드에서 notify()가 호출되면 깨어나게 된다. */
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("소비자 : " + data + "번 상품을 소비하였습니다.");
        empty = true;

        /* 대기 중인 스레드를 하나 꺠워서 다시 실행 대기 상태로 전환 시킨다. */
        notify();
    }

    public synchronized void setData(int Data) {
        if (!empty) {
            System.out.println("setData wait");
            try {
                /* 실행 중인 스레드를 일시 정지 시킨다. 다른 스레드에서 notify()가 호출되면 깨어나게 된다. */
                // setData 할 시점이 아니면 wait 하고 기다림
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // 전달한 자원을 공유 자원에 설정
        this.data = data;
        System.out.println("생산자 : " + data + "번 상품을 생산하였습니다.");
        empty = true;

        /* 대기 중인 스레드를 하나 꺠워서 다시 실행 대기 상태로 전환 시킨다. */
        // getData가 wait 하고 있으면 호출해서 깨어나게 함
        notify();
    }

}

// 누군가는 계속 값을 설정하고, 누군가는 계속 값을 가져감
// synchronized 키워드가 붙은 메소드
