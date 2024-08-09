package com.kenny.section03.filterstream;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {
        /* ObjectInputStream/ObjectOutputStream : 객체 단위 입출력 보조 스트림 */

        MemberDTO[] members = {
            new MemberDTO("user01", "pass01", 25, '남', 95.7),
            new MemberDTO("user02", "pass02", 30, '여', 84.2),
            new MemberDTO("user03", "pass03", 35, '여', 72.6),
        };

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"))) {
//            oos.writeObject(members); // 배열 형태도 가능
            for(MemberDTO member : members){
                oos.writeObject(member);
            }

        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }

        MemberDTO[] inputMembers = new MemberDTO[members.length];

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.txt"))) {
            for(int i = 0; i < inputMembers.length; i++){
                inputMembers[i] = (MemberDTO) ois.readObject();
            }
            // 담고 싶은 타입은 MemberDTO 인데, 읽는 건 더 상위인 Object 이므로 다운 캐스팅이 필요함
            // readObject는 반환 타입이 최상위 타입인 Object(그래야 MemberDTO를 읽든, MemberDTO 배열을 읽어오든..)
            // 나는 MemberDTO를 읽어오고 싶은데, 반환되는 타입은 Object 임. 다운 캐스팅은 명시적으로 해야 함.
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            /* 역직렬화 시 해당하는 클래스가 없으면 실패하므로 Exception handling이 필수이다.*/
            e.printStackTrace();
        }
        // 파일(클래스가 들어있음)을 읽어와 내가 원하는 타입의 객체로 만드려고 함.
        // 만약 프로그램에 해당 클래스가 없으면 역직렬화를 할 수 없음.

        for(MemberDTO member : inputMembers){
            System.out.println(member);
            //toString을 오버라이드 했기 때문에 member 레퍼런스 변수로 출력 가능
        }

    }
}
