package com.kenny.chap02.section07.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 3. 가중치 그래프 (인접 리스트) */
public class WeightedGraph<T> {

    // 정점과 이웃 정점을 저장할 map, 가중치는 Map의 Integer 타입으로 표기
    private Map<T, Map<T, Integer>> adjList;    // 두 번째 T: 연결된 노드, Integer : 가중치
    // 키 값 : 그래프의 정점
    // 밸류 값: 정점 리스트(이웃해 있는 정점). 해당 노드와 연결된 노드들을 저장

    public WeightedGraph() {
        adjList = new HashMap<>();
    }

    // 그래프에 정점을 추가
    public void addVertex(T vertex) {
        // key 값이 존재하는 경우 Map의 value를 반환하고,
        // key 값이 존재하지 않는 경우 key와 value를 저장 후 null 반환
         adjList.putIfAbsent(vertex, new HashMap<>());
//        adjList.put(vertex, new ArrayList<>());   // 이렇게 하지 않음
    }

    /* 간선 추가 시 가중치도 함께 추가 됨 */
    public void addEdge(T from, T to, int weight) {
        addVertex(from);
        addVertex(to);
        adjList.get(from).put(to, weight);
    }

    // 노드 제거 시 고려할 점
    // 1) 해당 노드
    // 1) 해당 노드와 연결되어 있는 노드의 엣지
    public void removeVertex(T vertex) {
        adjList.values().forEach(edge -> edge.remove(vertex));  // 제거할 정점과 연결된 간선 제거
        // value에는 누구와 연결되어 있는지에 대한 리스트가 들어있음. 반복문으로 제거할 정점을 '향해 있는' 간선을 제거함
        // 1 <- 3 그래프에서 1을 제거할 경우, <- 엣지 제거
        adjList.remove(vertex); // 정점 제거
    }

    public void removeEdge(T from, T to) {
        Map<T, Integer> edges = adjList.get(from);
        if(edges != null) edges.remove(to); // 연결된 간선이 있으면 to 쪽으로 연결된 간선 제거
    }
}

// 가중치 그래프
// 가중치에 대한 부분을 edge와 함께 관리.
// 특정 edge를 추가할 때 가중치를 함께 추가할 수 있도록 한다.