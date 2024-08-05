package com.kenny.section02.encapsulation.problem3;

public class Monster {
    // 코드를 제공하는 쪽 : ex) api, lib...
    // api는 유지보수하면서 변경됨. 개발자는 api를 가져와서 사용함. 이런 경우 개발자가 다 고쳐야 함.

    /* Monster 클래스에 변경 사항이 발생하였다.
    * name -> kinds로 변경 */
//    String name;
    String kinds;
    int hp;

    // 코드를 제공하는 Monster 측에서 유지보수를 함. 하지만 코드를 가져와 사용하는 appllication 측은 변경하지 않아야 함(코드를 고칠 필요x)
    public void setInfo(String info) {
        this.kinds = info;
    }
    public String getInfo() {
        return "몬스터의 이름은 " + this.kinds + "입니다.";
    }
}
