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
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());    // 테스트 케이스 수

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());    // 연산의 수
            TreeMap<Integer, Integer> map = new TreeMap<>();    // 이중 우선순위 큐의 역할을 할 TreeMap

            // 답
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                char cmd = st.nextToken().charAt(0);    // 연산 명령 (I or D)
                int value = Integer.parseInt(st.nextToken());   // insert 할 값 또는 delete 할 방식

                // case가 I, D 둘 뿐
                if (cmd == 'I') {   // 삽입
                    // Map은 key와 value로 이루어짐. 위에서는 둘다 Integer로 선언
                    // TreeMap을 쓰면 key 값을 기준으로 정렬됨.
                    // key, value(해당 키 값의 개수) <- 같은 값이 들어가도 상관 없도록

                    // 해당 값을 가지고 있다면 기존 값 + 1, 가지고 있지 않다면 0(default) + 1
                    map.put(value, map.getOrDefault(value, 0) + 1);
                    // getOrDefault : 키 값에 해당하는 값이 있으면 가져오고, 없으면 default로 설정한 값을 가져옴
                } else if(!map.isEmpty()) {    // 삭제 + 저장된 값이 있을 때만 수행
                    int key = (value == 1) ? map.lastKey() : map.firstKey();    // 정렬되어 있기 때문에 first인지 last인지 고르면 됨

                    // computeIfPresent : 키가 존재하지 않으면 아무런 작업 수행하지 않고 null 반환
                    // 키가 존재하면 remappingFunction 호출하여 null 반환 시 제거,
                    // 다른 반환 값이면 해당 값으로 업데이트 처리
                    map.computeIfPresent(key, (k1, v) -> (v == 1) ? null : v - 1);
                    // 첫 번째 인자는 key, 두 번째 인자는 람다식
                    // value 값이 1이면(1개 저장되어 있으면) 해당 값을 Map에서 해당 값 제거(null 반환)
                    // value 값이 1보다 크면(1개 초과 저장되어 있으면) 해당 값 - 1
                    // 이런 메소드 안 쓰고 맥락상 다르게 쓸 수도 있다
                }
            }

            if (map.isEmpty()) {
                sb.append("EMPTY\n");
            } else {
                sb.append(map.lastKey()).append(' ').append(map.firstKey()).append('\n');
            }
        }
        return sb.toString().trim();
    }
}

// TreeMap 사용
// I 삽입
// D 삭제 - 우선순위가 높거나 낮은 데이터를 삭제
// 큐가 비어있는 경우 EMPTY 출력



//            // 연산 입력 받기
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 1; j <= k; j++) {
//                String command = st.nextToken();
//                int val = Integer.parseInt(st.nextToken());
//                switch (command) {
//                    case "I" :
//                        map.put(j, val);
//                        break;
//                    case "D" :
//                        if (!map.isEmpty()) {
//                            if (val == 1) {
//                                map.pollFirstEntry();
//                            }
//                            else if(val == -1) {
//                                map.pollLastEntry();
//                            }
//                        } else {
//                            System.out.println("EMPTY");
//                        }
//
//                }
//            }