package com.kenny.chap05.section01.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Application3 {
    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2];   // 회의의 개수 + (시작시간/종료시간)

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());  // 시작 시간
            time[i][1] = Integer.parseInt(st.nextToken());  // 종료 시간
            // 0 -> 1 4
            // 1 -> 2 5
            // ...
            // 11 -> 12 14
        }
        /* 종료 시간이 빠른 순, 종료 시간이 동일할 경우 시작 시간이 늦은 순으로
        * 회의 스케줄을 배정한다. */

        // 종료 시간이 빠른 순으로 정렬 - Comparator 익명 클래스 구현 <- 난 이렇게 했는데 답안은 람다식 쓴 듯?
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];   // 1번 인덱스 기준 오름차순 정렬
            }
        });

        int endTime = 0;    // 직전 회의가 끝난 시간을 담아 둘 변수
        int maxCount = 0;   // 회의가 배정된 개수

        // 종료 시간이 동일할 경우 시작 시간이 늦은 순으로 정렬
        for (int i = 0; i < N; i++) {
            /* 시작 시간과 종료 시간이 같은 회의는 무조건 열 수 있다. */
            if (time[i][0] == time[i][1]) {
                maxCount++;
                continue;   // continue를 만나면 반복문 조건 증가
            }

            /* 앞선 회의가 끝나는 시간과 일치하거나 이후에 시작되는지? */
            if (endTime <= time[i][0]) {    // 현재 배정하려는 시작 시간이 이전 회의의 끝나는 시간과 같다면(회의 배정 가능)
                maxCount++;
                endTime = time[i][1];   // 이후 회의 배정시 사용할 종료 시간 수정
            }
        }

        /* 최대 넣을 수 있는 회의의 개수 */
        return maxCount;
    }
}
