package chap13_collection.com.kenny.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";
        Queue<String> queue = new LinkedList<String>();


        label:
        while (true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit') : ");
            switch (input = sc.nextLine()) {
                case "next" :
                    System.out.println("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit') : ");
                    break;
                case "exit" : break label;
                default :
                    System.out.println(input + " 고객님 대기 등록 되었습니다.");
            }
        }

    }
}
