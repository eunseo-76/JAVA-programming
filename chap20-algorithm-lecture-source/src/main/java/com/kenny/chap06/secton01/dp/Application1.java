package com.kenny.chap06.secton01.dp;

import java.util.Arrays;

public class Application1 {

    static final int INF = 9999;   // 들어올 수 없는 값

    public static int solution(int N) {

        /* dp 배열의 인덱스 값이 곧 해당 키로 수의 봉지 개수가 될 수 있도록 저장한다 */
        int[] dp = new int[N + 1];

        /* 배열의 모든 값을 초기화 (INF) */
        Arrays.fill(dp, INF);

        /* 인덱스 범위를 벗어나지 않도록 크기를 확인한 뒤 기본 값 초기화 */
        if (N >= 3) dp[3] = 1;
        if (N >= 5) dp[5] = 1;

        for (int i = 6; i <= N; i++) {
            /* 3 이전 또는 5 이전 인덱스의 봉지 개수 + 1(INF가 아닌 값으로 처리) */
            dp[i] = Math.min(dp[i-3], dp[i-5]) + 1; // INF가 아닌 값(답을 구할 수 없는 항이 있을 수 있으므로)을 선택하여 봉지가 하나 늘어남
        }

        return dp[N] >= INF ? -1 : dp[N];
    }
}

// DP는 점화식을 찾아야 하는데, 점화식을 찾으려면 어떻게 동작하는지 한 번 적어보는 게 좋다.