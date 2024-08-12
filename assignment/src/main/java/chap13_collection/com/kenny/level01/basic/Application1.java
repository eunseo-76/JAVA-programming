package chap13_collection.com.kenny.level01.basic;

import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        int input = 0;
        int sum = 0;

        label:
        while(true){

            System.out.print("학생 성적 : ");
            input = sc.nextInt();
            System.out.print("추가 입력하려면 y: ");
            str = sc.next();
            list.add(input);
            if(!str.equals("y")){
                break label;
            }
        }
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("학생 인원 : " + list.size() + "\n평균점수 : " + (double) (sum / list.size()));
    }
}
