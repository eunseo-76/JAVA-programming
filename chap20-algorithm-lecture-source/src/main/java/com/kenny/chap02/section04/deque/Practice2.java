package com.kenny.chap02.section04.deque;

import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Practice2 {

    public String solution(String command, Integer[] array) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();

        for (int i = 0; i < command.length(); i++) {
            // command 읽기
            StringTokenizer st = new StringTokenizer(command);
            char function = st.nextToken().charAt(i);

            // array의 수 읽기
            for (int j = 0; j < array.length; j++) {
                arr.addFirst(array[j]);
            }
            if (function == 'R') {  // R 이면 배열에 있는 수 뒤집기

            } else if (function == 'D') {   // D면 첫 번째 수 버림
                int result = arr.pollFirst();
            }
        }

        return null;
    }
}

//        for (int i = 0; i < command.length(); i++) {
//
//            // command 읽기
//            StringTokenizer st = new StringTokenizer(command);
//            char function = st.nextToken().charAt(i);
//
//            // array의 수 읽기
//            for (int j = 0; j < array.length; j++) {
//                arr.addFirst(array[j]);
//            }
//            if (function == 'R') {  // R 이면 배열에 있는 수 순서 뒤집기
//
//            } else if (function == 'D') {   // D면 첫 번째 수 버림
//                arr.pollFirst();
//            }
//        }