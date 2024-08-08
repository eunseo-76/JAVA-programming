package com.kenny.sectino02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* FileInputStream을 사용할 수 있다. */
        // 이름을 보고 해석 할 수 있도록 하자.
        //InputStream : byte 기반 입력 스트림
        //File 대상으로 stream 생성.

        //fis 인식하려면 블럭 밖에서 선언해야
        FileInputStream fis = null;
        try {
            /* 읽어올 대상 파일이 존재하지 않는 경우에 대해서 FileNotFoundException 처리가 필요함 (*/
            fis = new FileInputStream("testInputStream.txt");

            /* 파일에 기록 된 값을 순차적으로 읽어오고 더 이상 읽어올 데이터가 없으면 -1 반환 */
//            int value;
//            while ((value = fis.read()) != -1) {  //1byte만 가져옴
//                System.out.println((char)value);
//            }

            /* byte 배열을 이용해 한 번에 읽어올 수 있다. */
            byte[] bar = new byte[100];
            fis.read(bar);
            System.out.println(Arrays.toString(bar));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(fis != null){
                try {
                    /* 자원 반납이 필요한 이유?
                    * 1. 장기간 실행 중인 프로그램에서 스트림을 닫지 않으면 누수(leak) 발생 가능성 (os에서 빌려줄 수 있는 자원이 부족해질 수 있음)
                    * 2. 버퍼의 잔류 데이터가 남은 상태에서 추가로 스트림을 사용하면 데드락(deadlock) 발생 가능성 (잔류 데이터 때문에 접근 불가하여 계속 기다리는 상황)
                    *  */
                    fis.close();    // 닫는 것도 ioException 처리가 필요하다
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        // 텍스트에 한글이 들어가는 경우, 3byte 짜리를 1byte로 불러오기 떄문에 오류 발생
    }
}

// stream은 os에서 빌려오는 것. 빌렸으면 다시 반납해야 한다. (여태 신경 안 씀)
// File --Stream--> [   ]