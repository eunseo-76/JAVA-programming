package com.kenny.chap02.section07.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 2. 무방향 그래프 (인접 리스트) */
public class UndirectedGraph<T> {
    // 자바에는 그래프만을 위한 클래스는 없다.

    private Map<T, List<T>> adjList;    // 정점과 이웃 정점을 저장할 map
    // 키 값 : 그래프의 정점
    // 밸류 값: 정점 리스트(이웃해 있는 정점). 해당 노드와 연결된 노드들을 저장

    public UndirectedGraph() {
        adjList = new HashMap<>();
    }

    // 그래프에 정점을 추가
    public void addVertex(T vertex) {
        // putIfAbsent : key 값이 존재하는 경우 Map의 value를 반환하고,
        // key 값이 존재하지 않는 경우 key와 value를 저장 후 null 반환
         adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    /* 무방향 그래프이기 떄문에 양쪽에 이웃 정점 추가 */
    public void addEdge(T vertex1, T vertex2) {
        addVertex(vertex1);    // 노드가 존재하지 않는 경우, 엣지 추가 이전에 노드를 먼저 추가하도록 함
        addVertex(vertex2);
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);
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

    /* 무방향 그래프이기 때문에 간선 제거 시 양쪽 노드에서 제거 */
    public void removeEdge(T vertex1, T vertex2) {
        List<T> edges1 = adjList.get(vertex1);
        List<T> edges2 = adjList.get(vertex2);
        if(edges1 != null) edges1.remove(vertex2);
        if(edges2 != null) edges2.remove(vertex1);
    }
}

// 방향 그래프 vs 무방향 그래프
// 방향 그래프 : 한 쪽에서만 방향 표시
// 무방향 그래프 : 양쪽 노드에 모두 간선에 대한 내용 추가