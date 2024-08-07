package chap09_api.com.kenny.level01.basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String s = sc.nextLine();
        String[] arr = new String[s.length()];
        arr = s.split(" ");

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = s.split(" ");
//        }
//        이건 왜 안 되지?

        System.out.print("변환된 문자열 :");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i].toUpperCase();
//            System.out.print(" " + arr[i]);
//        }

        for (int i = 0; i < arr.length; i++) {
            char[] arr2 = new char[arr[i].length()];
            for (int j = 0; j < arr[i].length(); j++) {
                System.out.print("/" + arr[i].charAt(j));
                // 문자열의 첫 번째 글자만 어케 바꾸지 ?.?
                // 문자열을 charat으로 쪼개서 새 문자열로 나눈 다음 바꿔서 append?
                
            }
        }

        System.out.println("\n총 단어 개수 : " + s.split(" ").length);

    }
}


//                    arr[i] = Character.toString(arr[i].charAt(j)).toUpperCase();


/* ----- 입력 예시 -----
 *
 * 문자열 입력 : I will be a good developer.
 *
 * ----- 출력 예시 -----
 *
 * 변환된 문자열: I Will Be A Good Developer.
 * 총 단어 개수: 6
 */
