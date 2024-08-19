package com.kenny.chap02.section04.deque;

import javax.swing.plaf.basic.BasicLookAndFeel;
import java.util.ArrayDeque;
import java.util.Deque;

public class Practice1 {

    // 풍선 번호와 이동값을 다루는 클래스
    static class Balloon {
        int order;
        int noteValue;

        Balloon(int order, int noteValue) {
            this.order = order;
            this.noteValue = noteValue;
        }
    }

    public String solution(Integer[] notes) {
        StringBuilder sb = new StringBuilder();

        // 풍선을 Dequeue에 삽입
        Deque<Balloon> balloons = new ArrayDeque<>(); // Dequeu<Ballon>과 ArrayDeque<Ballon>은 무슨 차이?
        for (int i = 0; i < notes.length; i++) {
            balloons.add(new Balloon(i + 1, notes[i]));   // notes: 3 2 1 -3 -1
        }

        // 무조건 첫 번째 풍선이 먼저 제거
        Balloon current = balloons.removeFirst();
        sb.append(current.order);

        // 모든 풍선이 터질 때까지 반복
        while (!balloons.isEmpty()) {

            // 터진 풍선에 기록된 이동 값
            int moveValue = current.noteValue;

            // 양수냐 음수냐에 따라 이동 방향 변경
            // 1 2 3 4 5 에서 1번 꺼냄
            // 양수: 2 3 4 5 상태에서 2, 3 을 맨 뒤로
            // 음수: 2 3 4 5 상태에서 5, 4 를 맨 앞으로
            if (moveValue > 0) {
                // 양수는 오른쪽 이동이므로 이동 값 만큼 앞 요소를 빼서 뒤로 삽입
                for (int i = 1; i < moveValue; i++) {
                    balloons.addLast(balloons.removeFirst());
                }
                current = balloons.removeFirst();
                // moveValue보다 1 작게 반복해야 함
                // 1부터 이동 시작이므로 1 -> 2 -> 3 -> 4 까지 가되 4는 맨 앞에 남아있어야 함
            } else {
                // 음수는 왼쪽 이동이므로 이동 값 만큼 뒷 요소를 빼서 앞으로 삽입
                for (int i = 1; i < -moveValue; i++) {
                    balloons.addFirst(balloons.removeLast());
                }
                current = balloons.removeLast();
            }
            sb.append(" ").append(current.order);
        }
        return sb.toString();

//        ArrayDeque<Integer> deq = new ArrayDeque<>();
//
//        // 이동값을 덱에 넣기
//        for (int i = 0; i < notes.length; i++) {
//            deq.push(notes[i]);
//        }
//
//        while (!deq.isEmpty()) {
//            int move = deq.poll();
//            // 만나는 값이 양수인 경우 (해당 값을 없애고 그 뒤에 있는 값들을 맨 뒤로)
//            if (move > 0) {
//                for (int i = 0; i < move; i++) {
//                    deq.offerLast(i);
//                }
//            } else {
//                for (int i = 0; i < move; i++) {
//                    deq.offerFirst(i);
//                }
//            }
//        }
//
//        // 만나는 값이 음수인 경우 (해당 값을 없애서 그 앞에 있는 값들을 맨 앞으로)
//
//
//        return null;
    }

}

// 백준 2346
// ArrayDeque: 양방향.
// 1 2 3 4 5 풍선을 덱에 넣음. 앞에 있는 걸 뒤로 넣거나, 뒤에 있는 걸 앞으로 넣는 방향 2가지 가능
// 풍선 번호와 이동값 2가지를 하나의 클래스로 정의해서 사용하면 더 쉬울 것이다.

