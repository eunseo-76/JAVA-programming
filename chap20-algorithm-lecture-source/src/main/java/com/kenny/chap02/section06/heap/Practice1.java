package com.kenny.chap02.section06.heap;

import java.util.PriorityQueue;

public class Practice1 {

    public String solution(Integer[] array) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            // (-2, 2) 인 경우, 절대값으로 만들어 (2, 2) 비교하는 경우
            // absCompare가 0이 되므로 그냥 비교
            int absCompare = Integer.compare(Math.abs(o1), Math.abs(o2));

            if (absCompare == 0) {
                return Integer.compare(o2, o1);
            }
            return absCompare;

            // 람다식 쓰지 않으면 익명 클래스를 구현하거나 메소드를 만든다
        });

        StringBuilder sb = new StringBuilder();

        for(int x : array) {
            if (x == 0) {   // 0인 경우 데이터 꺼내기
                // 꺼낼 값이 없는 경우
                if (pq.isEmpty()) {
                    sb.append(pq.poll());
                } else {
                    sb.append(pq.poll()).append(" ");
                }
            } else {
                pq.offer(x);    // 0이 아닌 경우
            }
        }
        return sb.toString().trim();    // 마지막 공백 제거
    }
}


//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != 0) {    // 삽입
//                minHeap.offer(array[i]);
//                maxHeap.offer(array[i]);
//            } else {    // 삭제
//                // 가장 큰 값, 가장 작은 값 꺼낸 후 절대값 비교
//                int min = minHeap.poll();
//                int max = maxHeap.poll();
//                int val = (min * (-1) > max) ? min : max;
//                System.out.println(val);
//
//            }
//        }