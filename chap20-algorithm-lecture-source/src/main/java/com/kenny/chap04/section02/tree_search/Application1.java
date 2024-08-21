package com.kenny.chap04.section02.tree_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* 트리 알고리즘을 활용하는 예제를 이해할 수 있다. */
public class Application1 {

    static int N;   // 노드의 개수
    static List<Integer>[] list;    // 연결 노드 저장 배열
    static int[] parent; // 최종 결과 저장 배열
    static boolean[] visit; // 방문 결과 저장 배열

    public static String solution(String input) throws IOException {

        BufferedReader br = new BufferedReader(new StringReader(input));
        N = Integer.parseInt(br.readLine());

        //초기화
        visit = new boolean[N + 1];
        parent = new int[N + 1];
        list = new ArrayList[N + 1];

        // list 인스턴스 생성
        for (int i = 1; i < N + 1; i++) {   // 0번 인덱스 사용 안 함 (1부터 N까지)
            list[i] = new ArrayList<>();
        }

        /* N -1 개 줄의 입력을 처리 */
        StringTokenizer st;
        for (int i = 1; i < N ; i++) {
            // i = 0 ~ < N -1 또는 i = 1 ~ < N 가능
            // 여기서는 i를 반복문 내에서 쓰지 않기 때문에 꼭 0부터 시작하지 않아도 된다(사실 상 while문 돌리는 것과 같음)
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 이전처럼 2차원 배열로 노드들을 그대로 넣으면 부모-자식 개념이 없기 때문에 새로운 자료 구조 사용
            // 스터디에서 BFS, DFS 문제 풀 때 사용했던 방법 ~.~
            list[a].add(b); // a 노드가 연결된 노드를 저장하는 list에 b 노드 추가
            list[b].add(a); // b 노드가 연결된 노드를 저장하는 list에 a 노드 추가
        }

        dfs(1);

        /* dfs 이후 parent 노드에는 각 노드의 부모 노드가 담겨 있다. */
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < parent.length; i++) {
            sb.append(parent[i]).append(" ");
        }

        return sb.toString();
    }

    private static void dfs(int parentNode) {
        /* 이미 방문한 노드는 부모 노드이고 부모 노드는 재방문하지 않도록 함 */
        visit[parentNode] = true;

        /* 연결된 노드를 반복 */
        for(int childNode : list[parentNode]) {
            if (!visit[childNode]) {
                // 부모를 관리하는 배열에 해당 자식 노드의 부모를 담는다.
                parent[childNode] = parentNode;
                // [x][x][4][6][1][3][1][4] = parent
                //  0  1  2  3  4  5  6  7  // 0은 비우고, 1도 루트 노드이므로 부모가 없음
                // 그 자식 노드를 부모로 하는 자식 노드를 탐색한다.
                dfs(childNode);
            }
        }
    }
}
