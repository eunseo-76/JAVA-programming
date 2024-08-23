package com.kenny.chap06.secton01.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

/* Knapsack 알고리즘 (배낭 알고리즘) */
public class Application6 {
    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 물건의 개수
        int k = Integer.parseInt(st.nextToken());   // 가방 무게

        int[][] dp = new int[n + 1][k + 1]; // dp[물건 인덱스][무게] = 가치 최적값

        for (int i = 0; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());   // 물건의 무게
            int v = Integer.parseInt(st.nextToken());   // 물건의 가치

            /* 각 물건에 대한 dp 배열의 행의 값을 채워 나가는 작업 (가능한 무게 k까지 반복 */
            for (int j = 1; j <= k; j++) {

                /* 해당 물건의 무게보다 가방 무게가 낮은 경우 담을 수 없다.
                * => 가치 값의 변화가 없으므로 이전 행의 값이 그대로 반영된다. */
                // 물건 담을 수 x -> 가치의 변화 x -> 이전의 최적해 그대로 가져옴
                if (j < w) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    /* 해당 물건의 무게보다 가방 무게가 큰 경우 담을 수 있다. */
                    /* 담는다 : 물건 가치 + 해당 무게 빼고 남을 수 있는 가치 vs 담지 않는다 : 이전 행의 값 그대로 반영 */
                    // 담을 수는 있으나 담을지 말지 선택해야 함. 기존 최적해의 가치 vs 새 최적해의 가치
                    dp[i][j] = Math.max(v + dp[i - 1][j - w], dp[i - 1][j]);

                }
            }
        }
        return dp[n][k];
    }
}
