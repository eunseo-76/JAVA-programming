package com.kenny.chap05.section01.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* Union & Find
* 집합 간의 연산을 효율적으로 처리하기 위해 설계된 데이터 구조
* 특지 집합의 합집합(uion)과 특정 원소가 속한 집합의 찾기(find) 연산을 빠르게 처리하는데 유용하다.
* 집합은 서로 다른 원소들로 구성되며, 초기에는 각 원소가 독립적인 집합을 형성한다.
* */
public class Application5 {

    static int[] parent;
    // 친구가 5명인 경우(1~5번 친구)
    // [1][2][3][4][5]  // 초기에는 각각 배열에 친구가 혼자 있음
    // (1, 2)가 친구라면 둘을 병합하는 메소드가 union.
    // 둘을 병합하기 위해 대표값이 누구인지 찾는 find 메소드. (1의 대표값은 1, 2의 대표값은 2)
    // [1][1][3][4][5]  // 2번이 1번 그룹이 된다.
    // 그 뒤 (2, 3)이 친구라면 find 메소드로 1, 3의 대표값을 찾는다. (1은 1, 3은 3)
    // [1][1][1][4][5]  // 3번이 1번 그룹이 된다.
    // (3, 4) -> [1][1][1][1][1][5]
    // parent 배열의 인덱스에 접근하는 것만으로 친구인지 아닌지 알 수 있게 된다.

    /* 특정 원소가 속한 집합을 찾는 연산
    * 이를 통해 집합의 대표 원소(루트 토드)를 찾고, 대표 원소를 알면 두 원소가 같은 집합에 속하는지 확인할 수 있다. */
    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    /* 두 개의 집합을 하나로 합치는 연산. 두 집합의 대표 원소를 비교하여 두 집합이 연결 되도록 함. */
    static void union(int x, int y) {
        // 두 개가 같은 그룹인지 확인
        int rootX = find(x);
        int rootY = find(y);
        // 앞쪽 원소를 root로 하는 기준으로 작성
        if (rootX != rootY) {   // 같은 그룹이 아니면
            parent[rootY] = rootX;  //
        }
    }

    public static String solution(String input) throws IOException {

        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // parent 배열 초기화
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        // M 개의 학생 쌍 처리
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);    // 그룹으로 만들어라
            System.out.println("union(" + a + "," + b + ")");
            System.out.println("parent: " + Arrays.toString(parent));
        }

        // 마지막 쌍의 친구 관계 확인
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        if (find(x) == find(y)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
