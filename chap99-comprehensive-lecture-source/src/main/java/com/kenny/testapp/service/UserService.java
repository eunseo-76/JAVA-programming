package com.kenny.testapp.service;

import com.kenny.testapp.aggregate.User;
import com.kenny.testapp.repository.UserRepository;

import java.util.ArrayList;

/* 트랜잭션 처리 (성공 실패에 따른 commit/rollback 및 비즈니스 로직 처리 */
public class UserService {

    // 파일 위치 분리
    private final UserRepository userRepository = new UserRepository();

    public void findAllUser() {
        ArrayList<User> findUsers = userRepository.selectAllUsers();
        // 반환받은 데이터 확인 출력

        for (User user : findUsers) {
            System.out.println("user = " + user);
        }
    }

    public void findUserByNo(int no) {
        // int 값 전달 받아

        // 값을 가져오는 동작은 repo에서 해야 한다
        User selectedUser = userRepository.selectUserByNo(no);  // 번호에 맞는 유저를 반환하는 selectUserByNO(no)
        // 번호와 일치하는 객체가 있거나, null 값이 있을 수도 있음
        if (selectedUser != null) {
            System.out.println(selectedUser);
        } else {
            System.out.println("해당 번호를 가진 회원은 없습니다.");
        }
    }

    public void registUser(User user) {
        // User 객체의 필드 중 no 필드가 있음. 이 필드는 유저가 직접 입력하는 게 아니라 자동으로 순서를 매겨야 함
        int lastMemberNo = userRepository.selectedLastUserNo(); // 마지막 유저의 번호 + 1
        user.setNo(lastMemberNo + 1);

        int result = userRepository.insertUser(user);

        if (result == 1) {
            System.out.println(user.getId() + "님 회원 가입이 완료되었습니다.");
        }
        /* DBMS와의 연동을 할 경우 이 시점에 commit, rollback 등의 처리 */

    }
}
