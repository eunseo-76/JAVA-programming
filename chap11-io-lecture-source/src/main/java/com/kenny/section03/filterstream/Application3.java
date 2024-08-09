package com.kenny.section03.filterstream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {
        /* DataInputStream/OutputStream : 데이터 입출력 보조 스트림 */
        // Data : 단위별로 입출력 가능하다는 의미

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.txt"))) {
            dos.writeUTF("홍길동");
            dos.writeInt(95);
            dos.writeChar('A');

            dos.writeUTF("유관순");
            dos.writeInt(85);
            dos.writeChar('B');

            dos.writeUTF("이순신");
            dos.writeInt(75);
            dos.writeChar('C');

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("score.txt"))){
            while(true) {
                /* 파일에 기록한 순서대로 읽어오지 않는 경우 에러가 발생하거나 의미 없는 데이터를 읽어오게 된다.*/
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readChar());
                //EOFExcetion : IOException을 상속받음.
                // read : -1, readLint() : null 로 파일의 끝을 판별함
                // End Of File. DataInputStream을 사용하는 경우, 파일의 끝을 만나면 EOFException이 발생한다.
            }
            /* read자료형() 메소드는 파일에서 더 이상 읽어올 값이 없는 경우 EOFException(End Of File) 발생*/
        } catch (EOFException e){
            System.out.println("파일 읽기가 완료되었습니다.");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        // 원래 1byte 단위로 데이터를 끊어서 읽어오지만, dataInputStream을 이용해 String, int, char로 변환해 가져옴

        // DataOutputSream 과 DataInputStream은 일종의 pair로 함께 사용함.
        // 그냥 일반적인 txt 파일 등을 DataInputStream으로 읽어올 때는 어떤 메소드를 사용할지 알 수 없음...

        // 이름, 성적, 등급 객체 자료형으로 만들어서 입출력 받는 게 낫지 않나? -> Application4
    }
}
