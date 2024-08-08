package chap11_io.com.kenny.level01.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String input1 = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String input2 = sc.nextLine();

        try(FileReader fr = new FileReader(input1)) {
            int value;
            char[] arr = new char[100];
            // input으로 들어올 파일의 크기를 미리 알아낼 수 있는 방법은 없나??
            fr.read(arr);
            try(FileWriter fw = new FileWriter(input2)){
                fw.write(arr);
                System.out.println("파일 복사가 성공적으로 완료되었습니다.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + input1 + "지정된 파일을 찾을 수 없습니다");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
