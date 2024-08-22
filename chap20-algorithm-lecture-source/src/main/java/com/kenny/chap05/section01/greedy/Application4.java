package com.kenny.chap05.section01.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Application4 {
/* 다익스트라 알고리즘
* : 음의 가중치가 없는 그래프의 한 정점에서 모든 정점까지의 최단 거리를 구하는 알고리즘
* 간선에 가중치가 없으면 너비 우선 탐색으로도 가능하지만 가중치가 있다면 최단 경로 보장이 어렵다.
* */

    static int n, m, start; // 노드 개수, 엣지 개수, 시작 노드
    static int[] dis;   // 다른 노드까지의 거리를 저장할 배열

    static class Edge implements Comparable<Edge> {
        int ver;    // 해당 엣지가 연결된 노드
        int cost;   // 가중치

        Edge(int ver, int cost) {
            this.ver = ver;
            this.cost = cost;
        }

        // 가중치 오름차순(가중치가 낮은 순으로)의 우선순위
        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
    public static String solution(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        // 배열 안에 배열이 존재하는 것과 같음.
        // ArrayList<Edge>[] 이거랑 어떻게 다른 거지?

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 각 노드의 가중치 기록할 배열
        dis = new int[n + 1];

        // 아직 거리가 판단되지 않은 경우에는 Integer 최대 값으로 채워 둔다.
        Arrays.fill(dis, Integer.MAX_VALUE);    // fill 메소드 : Array에 초기 데이터를 설정할 때 사용. int 배열이므로 0이었다가 MAX_VALUE로 설정


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());   // 시작 노드
            int b = Integer.parseInt(st.nextToken());   // 도착 노드
            int c = Integer.parseInt(st.nextToken());   // 가중치

            // 어떤 자료구조로 그래프를 담을까?
            // 가중치를 비교해야 하므로 엣지를 클래스로 만들어보자.
            // 엣지를 사용할 수 있도록 리스트를 선언한다.

            graph.get(a).add(new Edge(b, c));   // 리스트에서 시작 노드를 가져와서 다른 리스트에 엣지에 추가
        }

        /* 우선 순위 큐에 Edge가 담겼을 땐 우선 순위는 가중치가 낮은 순으로 정해진다. */
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, 0));

        dis[start] = 0; // 시작 노드이므로 가중치 없음

        while (!pq.isEmpty()) {
            Edge tmp = pq.poll(); // 큐에서 현재 ver 꺼내기

            int now = tmp.ver;    // 현재 엣지가 가지고 있는 ver...?
            int nowCost = tmp.cost;

            if(nowCost > dis[now]) continue;
            // 엣지를 타고 갈 필요가 없을 때

            /* 기준 정점과 연결된 이웃 정점을 큐에 추가하는 반복문 */
            for(Edge edge : graph.get(now)) {
                /* 거리를 기록해두는 배열에 저장된 값이
                * 현재 비용과 엣지를 타고 가는 비용을 더한 값보다 크다면 */
                if (dis[edge.ver] > nowCost + edge.cost) {
                    // 4 -> 2 로 가는 상황
                    // 4의 현재 비용은 9인데, 2로 가면 11임
                    // 2의 비용이었던 12보다 작으므로 업데이트를 해 주어야 함
                    /* 새로운 루트로 업데이트 한다. */
                    dis[edge.ver] = nowCost + edge.cost;
                    pq.offer(new Edge(edge.ver, nowCost + edge.cost));
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < dis.length; i++) {
            if (dis[i] != Integer.MAX_VALUE) {
                sb.append(dis[i]);
            } else {
                sb.append("impossible");
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
