package com.kenny.chap02.section06.heap;

import java.util.PriorityQueue;

public class Practice1 {

    public String solution(Integer[] array) {

        // PriorityQueue의 생성자 중 Comparator를 인자로 받는 생성자 사용
        PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> {
        // 람다식을 통해 Comparator 인터페이스의 compare 메소드 구현
            int absCompare = Integer.compare(Math.abs(o1), Math.abs(o2));   // 두 값이 같으면 0 리턴
            if (absCompare == 0) {
                return Integer.compare(o1, o2); // o1이 더 크면 1, 같으면 0, 작으면 -1 리턴
            }
            return absCompare;
        }));

        StringBuilder sb = new StringBuilder();

        for (int x : array) {
            if (x == 0) {   // 입력이 0인 경우 데이터 꺼내기
                if (pq.isEmpty()) { // 입력이 0이고 힙이 비어있을 때
                    sb.append("0 ");
                } else {
                    sb.append(pq.poll()).append(" ");   // 입력이 0이고 힙이 비어있지 않을 때
                }
            } else {
                pq.offer(x);    // 입력이 0이 아닌 경우 데이터 넣기
            }
        }
        return sb.toString().trim();    // 마지막 공백 제거
    }
}


// 람다식 쓰지 않으면 익명 클래스를 구현하거나 메소드를 만든다

// (-2, 2) 인 경우, 절대값으로 만들어 (2, 2) 비교하는 경우
// absCompare가 0이 되므로 그냥 비교