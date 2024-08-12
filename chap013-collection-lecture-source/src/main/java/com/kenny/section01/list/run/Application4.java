package com.kenny.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* stack에 대해 이해하고 사용할 수 있다. */
        Stack<Integer> integerStack = new Stack<>();

        /* Stack에 값을 추가할 때는 push() 메소드를 사용한다. add()도 가능하기는 하지만 Vector의 메소드이므로 push()를 사용하는 것이 좋다. */
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack : " + integerStack);   // 레퍼런스 출력
        // 출력은 가로지만 개념적으로 이해할 때는 세로로 쌓여있다고 생각하면 된다

        /* 스택에서 요소를 찾을 때 search() 메소드 사용
        * 인덱스가 아닌 위에서부터의 순번을 의미하며 가장 상다는 0이 아닌 1부터 시작한다. */
        System.out.println(integerStack.search(5)); // 인덱스 출력 x 위에서 몇 번째인지 o

        /* 스택에서 요소를 꺼내는 메소드
        * peek(): 가장 마지막(상단)에 있는 요소 반환
        * pop(): 가장 마지막(상단)에 있는 요소 반환 후 제거
        * */
        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        // 더이상 꺼낼 게 없으면 EmptyStackExcetion 발생
        /* 꺼내면서 요소를 제거하기 때문에 스택이 비어있는 경우에는 java.util.EmptyStackException이 발생한다. */
        System.out.println(integerStack);
    }
}
