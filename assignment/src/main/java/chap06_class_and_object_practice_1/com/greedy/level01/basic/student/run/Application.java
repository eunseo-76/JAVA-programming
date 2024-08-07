package chap06_class_and_object_practice_1.com.greedy.level01.basic.student.run;

import chap06_class_and_object_practice_1.com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continued = "";
        int count = 0;
    // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
    // while문을 사용하여 학생들의 정보를 계속 입력 받고
    // 한 명씩 추가 될 때마다 카운트함
    // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
    // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
    // 현재 기록된 학생들의 각각의 점수 평균을 구함
    // 학생들의 정보를 모두 출력 (평균 포함)
        StudentDTO student = new StudentDTO();

        label:
        while(true){
            String[] arr = new String[10];
            count++;
            System.out.print("학년 : ");
            arr[0] = scanner.nextLine();
            System.out.print("반 : ");
            arr[1] = scanner.nextLine();
            System.out.print("이름 : ");
            arr[2] = scanner.nextLine();
            System.out.print("국어점수 : ");
            arr[3] = scanner.nextLine();
            System.out.print("영어점수 : ");
            arr[4] = scanner.nextLine();
            System.out.print("수학점수 : ");
            arr[5] = scanner.nextLine();
            System.out.println("계속 추가할 겁니까? (y/n)");
            continued = scanner.nextLine();

            switch(continued){
                case "y" : break;
                case "n" : break label;
                default : break;
            }
        }

    }
}
