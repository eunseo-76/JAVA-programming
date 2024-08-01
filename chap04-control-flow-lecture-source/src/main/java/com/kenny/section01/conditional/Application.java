package com.kenny.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();    // 객체 생성(클래스명 변수명 = new 메소드명())
        //a.testSimpleIfStatement();
        //a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        //b.testSimpleIfElseStatement();
        //b.testNestedIfElseStatement();

        C_IfElseIf c = new C_IfElseIf();
        //c.testSimpleIfElseIfStatement();
        //c.testNestedSimpleIfElseIfStatement();
        //c.improveNestedIfElseIfStatement();

        D_switch d = new D_switch();
        d.testSimpleSwitchStatement();
        d.improveSwitchStatement();
    }
}
