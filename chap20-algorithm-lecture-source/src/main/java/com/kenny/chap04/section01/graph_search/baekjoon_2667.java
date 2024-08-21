package com.kenny.chap04.section01.graph_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 백준 2667 단지 번호 붙이기
public class baekjoon_2667 {

    static int N;   // 정사각형 지도의 한 변의 길이
    static int[][] map; // 지도 정보
    static boolean visited[][];   // 노드를 방문했는지 저장할 boolean 배열
    static int[] dx = {0, -1, 0, 1};    // x축 방향 배열
    static int[] dy = {1, 0, -1, 0};    // y축 방향 배열
    static ArrayList<Integer> house = new ArrayList<>(); // 각 단지의 집 수를 저장할 리스트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        // 초기화
        map = new int[N][N];
        visited = new boolean[N][N];

        // 맵 정보 받기
        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = (a.charAt(j)) - '0';
            }
        }

        // DFS를 사용하여 단지 수 및 각 단지 내 집의 수 계산
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    int houseCount = dfs(i, j);
                    house.add(houseCount);
                }
            }
        }

        // 단지 수 출력
        System.out.println(house.size());

        // 각 단지 내 집의 수 오름차순 정렬 후 출력
        Collections.sort(house);

        for (int i = 0; i < house.size(); i++) {
            System.out.println(house.get(i));
        }
    }

    public static int dfs(int x, int y) {
        visited[x][y] = true;
        int count = 1;  // 현재 집 포함

        for (int i = 0; i < 4; i++) {
            int curX = dx[i] + x;
            int curY = dy[i] + y;

            // 맵을 벗어나지 않으면서 방문한 적이 없고 집이 있다면
            if (curX >= 0 && curY >= 0 && curX < N && curY < N && !visited[curX][curY] && map[curX][curY] == 1) {
                count += dfs(curX, curY);
            }
        }
        return count;
    }
}
