package chap10_exception.com.kenny.level01.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("분자 입력 : ");
        String input1 = sc.nextLine();
        System.out.print("분모 입력 : ");
        String input2 = sc.nextLine();
        try{
            int result = (Integer.parseInt(input1))/(Integer.parseInt(input2));
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        } catch (InputMismatchException e) {
            System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("실행이 완료되었습니다.");
        }
    }
}
