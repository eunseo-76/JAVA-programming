package section03.references;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {
        /* 생성자 메소드 참조를 이해하고 활용할 수 있다. */
        Function<String, Member> function = Member::new;

        // 생성자도 일종의 메소드임
        // 문자열 하나 받아서 Member 타입을 반환하는 Member 생성자와 Function(?)이 동일
        Member member1 = function.apply("user01");
        Member member2 = function.apply("user02");
        System.out.println(member1);
        System.out.println(member2);
    }
}
