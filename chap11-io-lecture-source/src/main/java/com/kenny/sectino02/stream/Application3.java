package com.kenny.sectino02.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /* FileOutputStream 을 이해하고 사용할 수 있다. */

        /* 경로 문제 없이 파일이 존재하지 않을 경우에는 자동으로 파일이 생성 되지만
        * 존재하지 않는 경로가 포함 되면 FileNotFoundException이 발생한다.
        * 두 번째 인자로 true를 추가하면 존재하는 파일의 맨 끝에서부터 추가 된다. (이어쓰기) */
        // 기본적으로는 덮어쓰기이나, 2번째 인자로 true 추가 시 이어쓰기
        try(FileOutputStream fos = new FileOutputStream("testOutputStream.txt", true)) {

            fos.write(97);

            byte[] bytes = new byte[] {98, 99, 100, 101, 102, 10};
            fos.write(bytes);

            fos.write(bytes, 1, 3); // 1개는 건너 뛰고 3개 집어넣기

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
