package chap11_io.com.kenny.level01.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.print("파일 이름을 입력하세요 : ");
        input = sc.nextLine();

        try(FileReader fr = new FileReader(input)){
            // 파일 내용 출력
            System.out.println("===== 파일 내용 출력 =====");
            int value;
            while ((value = fr.read()) != -1){
                // fr.read() : 파일의 끝에 도달하면 -1 반환
                System.out.print((char) value);
                //한 글자씩 읽고 바로 출력
            }
            // char 배열로 받아오는 경우 배열의 크기를 어떻게 정하지?

        } catch (FileNotFoundException e) {
            System.out.println("오류: 해당 이름을 가진 파일이 없습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
