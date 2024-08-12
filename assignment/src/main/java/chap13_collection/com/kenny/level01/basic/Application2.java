package chap13_collection.com.kenny.level01.basic;

import java.lang.reflect.Array;
import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String input = "";

        label:
        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            input = sc.nextLine();
            list.add(input);
            System.out.print("최근 방문 url: ");

            if (list.size() < 5) {// 1234
                Collections.sort(list, Collections.reverseOrder());

                System.out.println(list);

                System.out.println(list);
            } else {
                System.out.print("[");
                for (int i = list.size() - 1; i >= list.size() - 5; i--) {
                    System.out.print(list.get(i) + ",");
                    // i[4] i[3] i[2] i[1] i[0]

                }
                System.out.println("]");
            }
            if (input.equals("exit")) {
                break label;
            }
        }

    }
}
