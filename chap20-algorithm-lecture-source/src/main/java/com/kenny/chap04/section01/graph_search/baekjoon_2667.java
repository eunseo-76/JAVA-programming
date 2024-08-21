package com.kenny.chap04.section01.graph_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 2667 단지 번호 붙이기
public class baekjoon_2667 {

    static int N;   // 정사각형 지도의 한 변의 길이
    static int[][] map; // 지도 정보
    static boolean visited[];   // 노드를 방문했는지 저장할 boolean 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        // 초기화
        map = new int[N][N];
        visited = new boolean[N];

        // stringtokenizer는 자를 때 기준이 필요하다(그냥 하면 공백 기준)
        // 맵 정보 받기

        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] =  (a.charAt(j)) - '0';
            }
        }
        // br.readLine().charAt() 이라고 하면 한 줄을 통째로 읽어서 첫 번째 값을 읽는다!!!!!!

    }

    public static void bfs(int start) {

    }
}

// 1 : 집
// 0 : 집 x
// 단지 : 상하좌우로 집이 있으면 단지

// 출력 1: 단지 수(연결 요소의 개수)
// 출력 2: 각 단지에 속하는 집의 수(연결 요소 내 노드의 수) (오름차순 출력)

//        // 맵 확인용
//        for(int[] a : map) {
//            for (int b : a) {
//                System.out.print(b);
//            }
//            System.out.println("");
//        }