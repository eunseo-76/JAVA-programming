package com.chap06_class_and_object_practice_1.com.greedy.level01.basic.student.model.dto;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public void StudentDTO() {

    }
    public void StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = (int) grade;
        System.out.println(this.grade);
        this.classroom = (int) classroom;
        this.name = (String) name;
        this.kor = (int) kor;
        this.eng = (int) eng;
        this.math = (int) math;
    }
//    public String getInformation() {
//        return
//    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
