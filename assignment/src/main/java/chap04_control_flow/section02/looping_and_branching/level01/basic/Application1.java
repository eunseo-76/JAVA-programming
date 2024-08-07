package chap04_control_flow.section02.looping_and_branching.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int result = 0;
        for(int i=1; i<11; i++){
            result += i;
        }
        System.out.println("1부터 10까지의 합 : " + result);
    }
}
/* 1부터 10까지 합계를 구하고 결과를 출력하세요
 *
 * -- 출력 예시 --
 * 1부터 10까지의 합 : 55
 * */