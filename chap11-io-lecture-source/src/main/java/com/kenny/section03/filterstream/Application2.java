package com.kenny.section03.filterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /* InputStreamReader, OutputStreamWriter : 형변환 보조 스트림
        * 기반 스트림이 byte 스트림이고, 보조 스트림이 char 스트림인 경우 사용한다. */
        // 이름이 짬뽕됨.
        // BufferedInputStream (byte인 경우) -> InputStream 기반 (byte) ex) FileInputStream
        // 이렇게 되어야 하는데 형변환을 수행한다

        /* 표준 스트림
        * 자바에서 콘솔, 키보드 같은 표준 입출력 장치로부터 데이터를 입출력하기 위한 스트림을
        * System.in, System.out, System.err 와 같은 형태로 제공하고 있다.
        * => 자주 사용되는 자원에 대해 미리 생성 해 둔 스트림으로 별도로 생성하지 않아도 된다.
        * */

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            // 보조 스트림 : BufferedReader (char 타입)
            // System.in : Byte 단위의 기반 스트림 (FileInputStream을 상속받음)
            // 이 둘의 중간에 형변환 스트림 InputStreamReader가 있음. byte -> char로 parsing을 해 주는 역할
            System.out.println("문자열 입력 : ");
            String value = br.readLine();
            System.out.println(" 입력받은 문자열 : " + value);
            // System.in을 사용했으므로 파일이 아니라 키보드로부터 입력을 받는 것

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /* 출력을 위해서 동일한 방식을 사용해 볼 수 있다. */
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            bw.write("출력 테스트");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // println 은 printStream의 후손이고, printStream은 OutputStream의 후손
        }
    }
}
