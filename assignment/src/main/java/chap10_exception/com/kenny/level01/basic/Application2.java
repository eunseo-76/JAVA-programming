package chap10_exception.com.kenny.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExceptionTest exceptionTest = new ExceptionTest();

        String input = "";
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        input = sc.nextLine();

        try{
            exceptionTest.EntranceCheck(input);
            System.out.println("");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
