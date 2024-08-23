package com.kenny.chap06.secton01.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/* LCS(Longest Common Subsequence) : 최장 공통 부분 수열 */
public class Application8 {

    static char[] arr1;
    static char[] arr2;
    static Integer[][] dp;

    public static int solution(String input) throws IOException {

        BufferedReader br = new BufferedReader(new StringReader(input));

        arr1 = br.readLine().toCharArray();
        arr2 = br.readLine().toCharArray();

        dp = new Integer[arr1.length][arr2.length];

        return lcs(arr1.length - 1, arr2.length - 1);
    }

    private static int lcs(int x, int y) {

        // 재귀 함수 종료 조건
        if (x < 0 || y < 0) return 0;

        // 재귀적으로 호출 시 항상 확인 필요
        if (dp[x][y] == null) {
            dp[x][y] = 0;

            // 서로 같은 문자가 발견되었다면 (common sequence 발견)
            if (arr1[x] == arr2[y]) {
                dp[x][y] = lcs(x - 1, y - 1) + 1;
            } else {
                // 서로 같은 문자가 아니라면 이전 인덱스의 값을 참조하되
                // (위의 방향, 왼쪽 방향) 둘 중 큰 값으로 참조한다.
                dp[x][y] = Math.max(lcs(x - 1, y), lcs(x, y - 1));
            }
        }
        return dp[x][y];
    }
}

// 문자열을 작게 잘라서 공통 시퀀스 구해보고 확장하기