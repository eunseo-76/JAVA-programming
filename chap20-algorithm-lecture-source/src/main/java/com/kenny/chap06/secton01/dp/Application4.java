package com.kenny.chap06.secton01.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application4 {

    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));

        int n = Integer.parseInt(br.readLine());

        int[][] p = new int[n + 1][n + 1];  // 삼각형 데이터 저장
        int[][] dp = new int[n + 1][n + 1]; // 내려오면서 가지는 최대 값을 기억할 배열
        StringTokenizer st;

        // dp 배열에 값 기록
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                p[i][j] = Integer.parseInt(st.nextToken());

                // dp[i][j]의 값은 dp[i-1][j-1] 또는 dp[i-1][j]에 기록된 값 중 큰 값을 선택해서 처리한다.
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + p[i][j];  // 이전의 큰 값 + 자기 자신

            }
            System.out.println(Arrays.toString(p[i]));  // dp 확인용
        }

        /* dp의 맨 아랫줄에 담긴 값 중에 max인 값이 최대값 */
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(answer < dp[n][i]) answer = dp[n][i];    // n행의 1~n열 중 가장 큰 값 찾기
        }

        return answer;
    }
}
