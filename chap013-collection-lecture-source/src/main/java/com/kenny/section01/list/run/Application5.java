package com.kenny.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* Queue에 대해 이해하고 사용할 수 있다. */
        Queue<String> que = new LinkedList<>();
        // LinkedList는 List 계열 인터페이스 뿐 아니라 Deque(양방향 큐) 라는 인터페이스를 구현함.
        // Deque가 Queue를 상속함. 즉 LinkedList가 queue를 구현함.
        // queue의 실제 구현은 linkedlist로 한다.

        /* 큐에 데이터를 넣을 때는 offer() 메소드를 사용한다. */
        // add도 가능하지만... queue의 메소드는 offer
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);

        /* 큐에서 데이터를 꺼내는 메소드
        * peek() : 큐의 가장 앞에 있는(먼저 들어온) 요소를 반환
        * poll(): 큐의 가장 앞에 있는(먼저 들어온) 요소를 반환하고 제거 */
        System.out.println("peek(): " + que.peek());
        System.out.println("que : " + que);

        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        /* 큐에서 반환할 값이 없는 경우 null 값을 반환 */
        System.out.println("que : " + que);

    }
}
