package com.kenny.section03.filterstream;

/* 객체 입출력 처리를 위해서는 반드시 직렬화 처리를 해야 한다.
* 직렬화 대상 클래스에 Seriallizable 인터페이스만 구현하면 직렬화가 필요한 상황인 경우 데이터 직렬화 처리가 된다. */

// 직렬화 : Object -> byte
// 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부에서도 사용할 수 있도록 바이트(byte)형태로 데이터를 변환하는 것
// 역직렬화 : byte -> Object
// MemberDTO 라는 타입의 객체를 가지고 있음. 이를 byte 형태로 직렬화하면 출력 스트림으로 내보낼 수 있음.

import java.io.Serializable;

public class MemberDTO implements java.io.Serializable {
    private String id;
    private String pwd;
    private int age;
    private char gender;
    /* 해당 필드는 직렬화 처리에서 제외하겠다는 의미이다. */
    private transient double point;

    public MemberDTO() {}

    public MemberDTO(String id, String pwd, int age, char gender, double point) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.gender = gender;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", point=" + point +
                '}';
    }
}
