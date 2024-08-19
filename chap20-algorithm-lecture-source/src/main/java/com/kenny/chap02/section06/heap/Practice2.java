package com.kenny.chap02.section06.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Practice2 {
    public long solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int jcnt = Integer.parseInt(st.nextToken());    // 보석 개수
        int bcnt = Integer.parseInt(st.nextToken());    // 가방 개수

        // 가방 힙(작은 순서대로 - 최소 힙)
        PriorityQueue<Integer> bpq = new PriorityQueue<>();
        // 보석 힙(비싼 순서대로 - 최대 힙)
        PriorityQueue<Integer> jpq = new PriorityQueue<>((o1, o2) -> o2 - o1);

        // 보석 무게, 가격 입력 받기
        for (int i = 0; i < jcnt; i++) {    // 보석 개수만큼 반복
            st = new StringTokenizer(br.readLine(), " ");
            int jweight = Integer.parseInt(st.nextToken());
            int jprice = Integer.parseInt(st.nextToken());
            jpq.offer(jprice);  // 보석 무게와 가격을 어떻게 연결 짓지? - 2차원 배열? 그럴거면 힙을 왜 씀?
        }

        // 가방 최대 무게 입력 받기
        for (int i = 0; i < bcnt; i++) {    // 가방 개수만큼 반복
            int bweight = Integer.parseInt(br.readLine());
            bpq.offer(bweight);
        }

        return 0;
    }
}

// 가방에 보석 1개만 담음
// 가방이 여러 개일 수 있음

// 가방 : 작은 가방부터 정렬
// 보석 : 비싼 가격부터 정렬
// 비싼 보석을 작은 가방에 넣는다
