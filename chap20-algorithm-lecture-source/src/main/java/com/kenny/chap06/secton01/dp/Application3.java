package com.kenny.chap06.secton01.dp;

import java.util.Arrays;

/* 파도반 수열
 * 파도반 수열의 점화식 f(n) = f(n-2) + f(n-3)
 * 1. 탑다운 방식 (재귀 호출)
 * 2. 바텀업 방식 (반복문) */
public class Application3 {

    static Integer[] dp = new Integer[101];

    public static int solution(int n) {
        dp[1] =dp[2] = dp[3] = 1;

//        return padovan(n);

        /* 2. 바텀업 (반복문) */
        for (int i = 4; i <= n; i++) dp[i] = dp[i - 2] + dp[i - 3];

        return dp[n];
    }

    /* 1. 탑다운(재귀 호출) */
    private static int padovan(int n) {

        // 이전에 저장한 값이 값이 없다면
        if (dp[n] == null) {    // Integer 배열이므로 기본값 null
            dp[n] = padovan(n - 2) + padovan(n - 3);
        }
        // 이전에 저장한 값이 있다면
        return dp[n];
    }
}




//        int dp[] = new int[n + 1];
//        Arrays.fill(dp, 9999);
//        if(n <= 2) dp[n] = 1;
//        // TopDown 방식
//        if (n <= 3) {   // n이 3 이하
//            return 1;
//        } else {    // n이 4 이상
//            dp[n] = solution(n - 2) + solution(n - 3);
//            return dp[n-1] >= 9999 ? -1 : dp[n-1];
//        }
// n= 1, 2, 3, 4, 5, 6, 7, .... 11, 12

//        // BottomUp 방식
//        dp[0] = dp[1] = dp[2] = 1;
//        for (int i = 3; i <= n; i++) {
//            dp[i] = dp[i - 2] + dp[i - 3];
//        }
//        return dp[n-1];