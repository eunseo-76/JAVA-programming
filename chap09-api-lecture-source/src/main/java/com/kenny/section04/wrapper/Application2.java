package com.kenny.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {
        /* parsing : 문자열 값을 기본 자료형으로 변경 */

        /* 해당 자료형으로 parsing 될 수 없는 문자열이 제공 되면 exception 발생 */
        byte b = Byte.parseByte("1");    // 1000을 넣으면 byte 범위를 벗어나므로 exception 발생
        short s = Short.parseShort("1");
        int i = Integer.parseInt("1");
        long l = Long.parseLong("1");
        float f = Float.parseFloat("1");
        double d = Double.parseDouble("1");
        boolean bl = Boolean.parseBoolean("true");    // true, false가 아닌 아무 문자열을 넣으면 false로 판단
        System.out.println(bl);
        /* Character는 parsing 기능을 제공하지 않는다. */
    }
}
