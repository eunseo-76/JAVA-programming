package com.kenny.section04.constructor;

import java.util.Date;

public class User {

    /* 필드(전역 변수) 선언부 */
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /* 생성자 선언부 */
    // 1. 메소드와 달리 반환형이 없음
    // 2. 생성자의 이름은 클래스명과 똑같아야 함

    /* 1. 기본 생성자 (default constructor) */
    public User(){
        System.out.println("User 클래스의 기본 생성자 호출 됨...");
    }

    /* 2. 매개변수 생성자*/
    /* 초기화 할 필드가 여러개인 경우 초기화하고 싶은 필드의 조합별로 생성자를 여러 개 작성할 수 있다. */
    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User 클래스의 id, pwd 초기화하는 생성자 호출 됨...");
    }
    public User(String id, String pwd, String name, Date enrollDate) {

//        this.id = id;
//        this.pwd = pwd;
        /* this() : 동일 클래스 내의 다른 생성자 메소드를 호출하는 구문
        * 리턴 되어 돌아오지만 리턴 값은 존재하지 않으며 가장 첫 줄에 선언해야 한다. */
        this(id, pwd);  // 생성자 내에서 생성자 메소드 호출 가능
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("User 클래스의 id, pwd, name, enrollDate 초기화 하는 생성자 호출 됨...");
    }
    
    /* 메소드 선언부 */

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getInformation(){
        //객체가 가질 수 있는 필드값을 한 줄의 문자열로 볼 수 있게 함
        return this.id + " " + this.pwd + " " + this.name + " " + this.enrollDate;
    }
}
