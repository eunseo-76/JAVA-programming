package chap10_exception.com.kenny.level01.basic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExceptionTest{
    public void EntranceCheck(String birth) throws Exception {

        // 사용자의 입력을 LocalDate 포맷으로 변경
        LocalDate ld = LocalDate.parse(birth);
        System.out.println("past : " + ld);
        int[] arr = new int[3];
        for(int i=0; i<2; i++){
            arr[i] = Integer.parseInt(birth.split("-"));
        }
        LocalDate past = LocalDate.of();



        System.out.println("입장하셔도 됩니다.");
    }
}
// 입력이 yyyy-MM-dd 인지 확인
    // 양식에 맞으면
        // 만 20세 미만인지 확인
    // 양식에 맞지 않으면
        // 오류 출력