package com.kenny.section5.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// 사용자의 입력값(문자열)을 내가 원하는 객체로 받으려면 pasring 필요
public class Application5 {
    public static void main(String[] args) {
        // 디폴트 형식이라 바로 parsing 가능
        String timeNow = "14:05:10";
        String dateNow = "2022-10-12";
        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);
        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);

        // 이런 경우 패턴을 만들어야 함
        dateNow = "221005";
        timeNow = "14-05-10";
        System.out.println("Pattern = " + LocalDate.parse(dateNow, DateTimeFormatter.ofPattern("yyMMdd")));
        System.out.println("Pattern = " + LocalTime.parse(timeNow, DateTimeFormatter.ofPattern("HH-mm-ss")));
        LocalDate localDate1 = LocalDate.now();
        LocalTime localTime1 = LocalTime.now();
        String dateFormat = localDate1.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
        String timeFormat = localTime1.format(DateTimeFormatter.ofPattern("HH시 mm분 ss초"));
        System.out.println("dateFormat = " + dateFormat);
        System.out.println("timeFormat = " + timeFormat);
    }
}