package com.kenny.chap04.section01.graph_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 원래 이 코드로 했는데 테스트 코드와 충돌이 남. 강사님이 에러를 찾을 수 없어서 정상 코드 Application2 다시 올려줌
// Application2로 볼 것.

public class Application2_1 {

    // 배추 밭의 가로 세로, 심어진 배추 수
    static int M, N, K;
    // 배추 밭
    static int[][] map; // mapping 할 배추 밭
    // 방문 배열
    static boolean[][] visit;
    // 상하 좌우 개념의 좌표 배열
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};
    // 지렁이 수
    static int count = 0;
    // BFS로 문제 해결 시 사용할 Queue
    static Queue<Node> q = new LinkedList<>();

    // x, y 좌표를 하나의 덩어리 객체로 만들기 위한 Node 클래스
    static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 탐색하는 x, y의 좌표
    static int cx, cy;

    public static int solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        visit = new boolean[M][N];

        /* 배추밭에 배추 심기 */
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
        }

        System.out.println("배추밭 출력");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /* 배추밭 내의 배추 찾기 */
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                /* 방문하지 않은 위치에 배추가 심어져 있다면 */
                if (map[i][j] == 1 && !visit[i][j]) {
                    /* 지렁이를 심자 */
                    count++;
                    /* 해당 위치와 붙어있는 배추밭을 방문 체크한다. (붙어있는 배추 묶음 파악) */
                    bfs(i, j);
                }
            }
        }
        return count;
    }

    /* 지렁이가 심어질 때마다 한 번씩 동작하는 함수 */
    // dfs, bfs 둘다 가능하다
    static void bfs(int x, int y) {
        q.add(new Node(x, y));
        visit[x][y] = true;

        /* 상하좌우에 배추가 심어져 있다면 해당 위치를 방문한 것으로 표시하고 queue를 통해 탐색하는 작업을 반복 */
        while (!q.isEmpty()) {
            Node cur = q.poll();    // 현재 노드
            /* 상하좌우 확인 */
            for (int i = 0; i < 4; i++) {
                cx = cur.x + dirX[i];   // 현재 좌표에서 이동할 좌표 (x: 0, 0, -1, 1)
                cy = cur.y + dirY[i];   // 현재 좌표에서 이동할 좌표 (y: -1, 1, 0, 0)

                /* 좌표로서 존재하면서 방문한 적이 없고 배추가 심어져 있다면 */
                if(rangeCheck() && !visit[cx][cy] && map[cx][cy] == 1) {
                    q.offer(new Node(cx, cy));  // 방문하면 큐에 담기
                    visit[cx][cy] = true;   // 방문했다는 사실을 저장
                }
            }
        }
    }

    /* 상하 좌우 체크 할 때 array의 범위를 넘어가지 않도록 하는 함수 */
    // 주의: map의 (0, 0) 위치의 경우 상, 좌를 탐색하면 배열에 존재하지 않는 인덱스를 접근하므로 excption 이 발생할 수 있다.
    private static boolean rangeCheck() {

        return cx >= 0 && cx < M && cy >= 0 && cy < N;
    }
}
