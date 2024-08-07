package chap09_api.com.kenny.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("문자열 입력 : ");
        String s = sc.nextLine();

        String[] arr = s.split(" ");
        // 문자열 배열의 값이 영문자인지 확인
            // 영문자이면 대소문자 중 하나로 변경
            // 배열의 값이 같은지 처음부터 끝까지 하나씩 비교
                // 같으면 빈도 카운트 1

        int cnt = 0;

        for (int i = 0; i < arr[i].length(); i++) {
            // 배열에 들어간 단어(문자열)이 영문자인 경우
        }

//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length(); j++) {
//                // 배열에 들어간 단어(문자열)이 영문자인 경우
//                if(arr[i].charAt(j) >= 65 && arr[i].charAt(j) <= 90) {  //대문자이면 소문자로 변환하여 배열에 넣기
//                    System.out.print(Character.toString(arr[i].charAt(j)).toLowerCase());    //charAt : string의 특정 인덱스 값을 char로
//                } else if (arr[i].charAt(j) >= 97 && arr[i].charAt(j) <= 122) { //소문자이면
//                    System.out.print("소");
//                }
//
//                // 배열의 값이 같은지 처음부터 끝까지 하나씩 비교
//                if (arr[i].equals(arr[j])) {
//                    System.out.println("arr[i] : " + arr[i] + "arr[j] : + arr[j]");
//                    cnt++;
//                    System.out.println("count: " + cnt);
//                }
//
//            }
//
//
//        }




    }
}
/* ----- 입력 예시 -----
 *
 * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
 *
 * ----- 출력 예시 -----
 *
 * ===== 단어 빈도 =====
 * hello: 2
 * world: 1
 * everyone: 1
 * 가장 빈도 높은 단어 : hello (2 번)
 */