package com.kenny.section03.copy;

public class Application2 {
    public static void main(String[] args) {
        /* 얕은 복사를 활용하여 매개변수와 리턴 값으로 활용할 수 있다. */

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 hashCode : " + names.hashCode());
        print(names);

        String[] arr = getAnimals();

        System.out.println("리턴 받은 arr의 hashCode : " + arr.hashCode());

        print(arr);

        // 메인 메소드에서 만든 배열의 주소값
    }
    public static void print(String[] sarr){
        // 매개변수로 string 배열을 전달받는 메소드
        System.out.println("sarr의 hashCode : " + sarr.hashCode());

        // 매개변수로 전달 시 얕은 복사가 됨(주소값이 전달됨)
        // 메소드에서 해당 배열로 원하는 행동을 할 수 있다

        for(int i = 0; i <sarr.length; i++){
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals(){
        // 배열이 메소드의 반환값이 될 수 있음

        String[] animals = {"낙타", "호랑이", "나무늘보"};

        System.out.println("animals의 hashCode : " + animals.hashCode());

        return animals; // animals 배열의 '주소값'을 리턴함

    }
}
