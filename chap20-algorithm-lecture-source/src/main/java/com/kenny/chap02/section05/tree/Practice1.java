package com.kenny.chap02.section05.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Practice1 {

    public String solution(String input) throws IOException {
        // input을 읽어와서 해석해서 처리
        BufferedReader br = new BufferedReader(new StringReader(input));    // input 문자열 한 줄 씩 읽기

        int t = Integer.parseInt(br.readLine());    // 테스트 케이스 수

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());    // 연산의 수
            TreeMap<Integer, Integer> map = new TreeMap<>();    // 이중 우선순위 큐의 역할을 할 TreeMap

            // 연산 입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= k; j++) {
                String command = st.nextToken();
                int val = Integer.parseInt(st.nextToken());
                switch (command) {
                    case "I" :
                        map.put(j, val);
                        break;
                    case "D" :
                        if (!map.isEmpty()) {
                            if (val == 1) {
                                map.pollFirstEntry();
                            }
                            else if(val == -1) {
                                map.pollLastEntry();
                            }
                        } else {
                            System.out.println("EMPTY");
                        }

                }
            }
        }

        //


        return null;
    }
}

// TreeMap 사용
// I 삽입
// D 삭제 - 우선순위가 높거나 낮은 데이터를 삭제
// 큐가 비어있는 경우 EMPTY 출력