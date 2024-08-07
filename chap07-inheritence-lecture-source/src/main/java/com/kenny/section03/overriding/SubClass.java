package com.kenny.section03.overriding;

public class SubClass extends SuperClass {
    @Override   // 컴파일러야 확인해라 라는 의미
    /* 메소드명, 리턴 타입, 매개변수의 개수&타입&순서 일치해야 성립 */
//    public void method(String num) {}   // 매개변수 타입 변경 안 됨
//    public void method(int num) { return 0; } // 반환형 변경 안 됨
//    public void method2(int num) {} // 이름 바뀌면 안 됨
//    public void method(int num) {}
    public void method(int num) {}

    /* private 메소드 오버라이딩 불가 */
//    @Override
//    private void method(int num) {}

    /* final 메소드 오버라이딩 불가 */
//    @Override
//    public final void finalMethod() {}  // 여기서 final을 지워도 마찬가지로 안 됨. superclass 에서 final이기 때문

    /* protected -> default로 변경 시 더 좁은 범위로의 변경이라 불가 */

//    @Override
//    void protectedMethod() {}

    /* protected -> public 로 변경 시 더 넓은 범위로의 변경이라 가능 */
    @Override
    public void protectedMethod() {}

    // public
    // protected : public으로 바뀔 수 있지만 default로는 못 바꿈
    // default
    // private
    // => 더 넓은 범위로 바꾸는 건 ok, 더 좁은 범위로 바꾸는 건 불가

}
