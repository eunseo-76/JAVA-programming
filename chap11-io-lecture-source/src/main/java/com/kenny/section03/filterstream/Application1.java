package com.kenny.section03.filterstream;

import java.io.*;

public class Application1 {
    /* 필터 스트림(보조 스트림) : 기반 스트림에 추가되어 성능 향상, 기능 추가
    * BufferedReader/Writer : 버퍼 공간을 이용하여 데이터를 쌓아두었다가 입출력하여 입출력 횟수를 줄이고 성능을 향상
    *  */
    // Buffered : byte,char  ===> [ [버퍼] 프로그램 ] ===
    // 입력되는 byte, char 같은 단위를 버퍼라는 공간에 쌓아두었다가 한 번에 입력 받음
    // 일반적인 기반 스트림에 버퍼 스트림을 붙여 처리하면 입력을 한 번에 처리할 수 있음
    public static void main(String[] args) {
        // 출력한 내용을 입력 받기

        BufferedWriter writer = null;
        try {
            // bufferedwriter라는 보조 스트림은 생성자에 기반 스트림이 전달되어야 함
            // filewriter는 생성자에 파일 타입 등이 전달되어야 하지만, 보조 스트림은 기반 스트림과 연결되어야 함
            /* 보조 스트림 객체 생성 시에는 생성자의 인자로 연결될 기반 스트림을 전달한다. */
            writer = new BufferedWriter(new FileWriter(("testBuffered.txt")));
            // 출력을 처리할 레퍼런스 변수 writer
            writer.write("안녕하세요\n");
            writer.write("반갑습니다.\n");

            /* 버퍼를 이용하는 경우 버퍼가 가득 차면 자동으로 내보내기를 하지만,
            * 가득 차지 않은 경우 flush() 로 내보내기를 해야 출력이 이루어진다. */
//            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    /* close()를 호출하면 내부적으로 flush()를 실행하고 난 뒤 자원을 반납한다. */
                    writer.close(); // 자원을 반납하기 전에 내부적으로 flush()가 이루어짐
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("testBuffered.txt"))) {
            /* readLine() 메소드 기능을 추가로 제공하고 있다.
            * 버퍼의 한 줄을 읽어와서 문자열로 반환하며 더 이상 읽어올 값이 없을 경우 null이 반환된다. */
            String temp;
            // 한 줄 씩 읽되 읽어올 내용이 없으면 출력
            while((temp = reader.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
