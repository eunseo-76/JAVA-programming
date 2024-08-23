package com.kenny.chap06.secton01.dp;

public class Application2 {
    public static int solution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
// n=1 -> 1
// n=2 -> 2
// n=3 -> 3
// n=4 -> 5
// 앞에 있는 항이 더해짐(피보나치)
