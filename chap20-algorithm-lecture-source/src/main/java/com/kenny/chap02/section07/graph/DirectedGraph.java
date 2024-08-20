package com.kenny.chap02.section07.graph;

import java.util.*;

/* 1. 방향 그래프 (인접 리스트) */
public class DirectedGraph<T> {
    // 자바에는 그래프만을 위한 클래스는 없다.

    private Map<T, List<T>> adjList;    // 정점과 이웃 정점을 저장할 map
    // 키 값 : 그래프의 정점
    // 밸류 값: 정점 리스트(이웃해 있는 정점). 해당 노드와 연결된 노드들을 저장

    private List<T> visited;    //해당 정점 방문 여부

    public DirectedGraph() {
        adjList = new HashMap<>();
    }

    // 그래프에 정점을 추가
    public void addVertex(T vertex) {
        // key 값이 존재하는 경우 Map의 value를 반환하고,
        // key 값이 존재하지 않는 경우 key와 value를 저장 후 null 반환
        adjList.putIfAbsent(vertex, new ArrayList<>()); // 키 값이 존재하지 않으면 새 리스트 넣기
//        adjList.put(vertex, new ArrayList<>());   // 이렇게 하지 않음
    }

    /* 방향 그래프이기 떄문에 from에서 to로 이웃 정점 추가 */
    public void addEdge(T from, T to) {
        // 노드가 존재하지 않는 경우, 엣지 추가 이전에 노드를 먼저 추가하기 위함
        addVertex(from);
        addVertex(to);
        // from에 해당하는 리스트를 받고, 그 리스트에 to 추가
        adjList.get(from).add(to);
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

    /* 방향 그래프이기 때문에 간선 제거 시 from에서 to를 제거 */
    public void removeEdge(T from, T to) {
        List<T> edges = adjList.get(from);
        if (edges != null) edges.remove(to); // 연결된 간선이 있으면 to 쪽으로 연결된 간선 제거
    }


    // Stack을 이용한 DFS(깊이 우선 탐색)
    public List<T> dfsUsingStack(T start) {
        Stack<T> stack = new Stack<>(); // 문자열, 숫자 등 여러 타입 들어갈 수 있음
        visited = new ArrayList<>();
        // 시작 정점을 스택에 담음
        stack.push(start);
        // 갈 수 있는 이웃 체크 해야 함 = 연결된 간선 확인
        /* 스택에서 꺼낼 정점이 없을 때까지 반복 */
        while (!stack.isEmpty()) {
            T vertex = stack.pop(); // 탐색할 정점을 꺼낸다.

            if (!visited.contains(vertex)) { // 해당 정점에 방문한 적이 있는지 확인(사이클 방지)
                visited.add(vertex);    // 방문한 적이 없으면 방문

                for (T v : adjList.getOrDefault(vertex, new ArrayList<>())) {
                    // 연결된 간선이 없을 경우 비어있는 리스트 가져온다
                    if (!visited.contains(v)) {
                        stack.push(v);  // 방문한 적이 없는 경다면 해당 정점의 이웃을 모두 스택에 담는다.
                    }
                }
            }
        }

        return visited;

    }

    // 재귀 호출을 이용한 DFS
    public List<T> dfsUsingRecursion(T start) {
        visited = new ArrayList<>();
        dfsUsingRecursionHelper(start, visited);

        return visited;
    }

    private void dfsUsingRecursionHelper(T start, List<T> visited) {
        if (!visited.contains(start)) {  // 이미 방문한 정점이라면 재귀 호출이 return 된다
            visited.add(start);

            for (T v : adjList.getOrDefault(start, new ArrayList<>())) {
                if (!visited.contains(v)) {
                    dfsUsingRecursionHelper(v, visited);    // 재귀 함수를 통해 반복 호출을 하되
                }
            }
        }
    }

    // Queue를 이용한 BFS 구현
    public List<T> bfsUsingQueue(T start) {
        visited = new ArrayList<>();
        Queue<T> queue = new LinkedList<>();

        queue.offer(start); // 시작 정점을 큐에 담음

        // 큐에 담긴 정점이 없을 때까지 반복
        while (!queue.isEmpty()) {
            T vertex = queue.poll();    // 나와 가까운 정점들이 순차적으로 뽑힌다

            if (!visited.contains(vertex)) {
                visited.add(vertex);

                //기준 정점에서 연결된 이웃들을 탐색
                for (T v : adjList.getOrDefault(vertex, new ArrayList<>())) {
                    if (!visited.contains(v)) {  // 이웃도 탐색한 적이 없을 경우
                        queue.offer(v);
                    }
                }
            }
        }

        return visited;
    }

    /* 두 노드 간의 경로가 있는지 확인하는 메서드 구현하기
    * -> 테스트 클래스에서 테스트 메소드로 확인 */
    public boolean hasPath(T start, T end) {
        // 매개변수 2개가 연결이 되어 있는지(직접이 아니더라도 타고 갈 수 있는지) 확인하는 메소드
        visited = new ArrayList<>();
        // 1. DFS 사용 버전
        return hasPathDFS(start, end, visited);
        // 2. BFS 사용 버전
        // return hasPathBFS(start, end, visited);
//        return false;   // 결과 true, false
    }


    public boolean hasPathDFS(T start, T end, List<T> visited) {
        visited = new ArrayList<>();

        System.out.println("start: " + start + " end: " + end);

        // 시작 노드에서 목표 노드까지 탐색할 수 있으면 true 반환
        if (!visited.contains(start)) {
            visited.add(start); // 시작 방문 노드 표시

            for(T v : adjList.getOrDefault(start, new ArrayList<>())) {
                if (!visited.contains(v)) {
                    hasPathDFS(v, end, visited);
                    System.out.println("true");
                    return true;
                }
            }
        }
        System.out.println("false");
        // 시작 노드에서 인접 노드를 탐색했으나 목표 노드를 탐색할 수 없으면 false 반환
        return false;

    }
}

// addVertex() 메소드
// 왜? map 안에 이미 정점이 들어가 있는데 다시 정점을 넣는 경우, 즉
// 1 -> 2, 1 -> 3 그래프에 다시 1을 넣는 경우 : 동일한 키 값인 1이 들어가면 value 값이 덮어쓰기 됨(간선의 정보가 리셋됨)
// 이미 존재하는 경우 추가를 안 하고, 새로운 노드가 들어왔을 때만 추가를 한다.