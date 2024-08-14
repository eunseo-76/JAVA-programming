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

    public void removeUser(int no) {
        int result = userRepository.deleteUser(no);

        if (result == 1) {
            System.out.println("회원 탈퇴가 완료되었습니다.");
        } else {
            System.out.println("입력하신 회원 번호에 해당하는 회원이 없습니다.");
        }
        /* DBMS와의 연동을 할 경우 이 시점에 commit, rollback 등의 처리 */
    }

    public User findUserForModify(int no) {

        User selectedUser = userRepository.selectUserByNo(no);
        //이 메소드에서 반환하는 selectedUser 값으로 reform() 메소드 호출할 것임.
        // reform에서 어떤 걸 수정할 지 입력받아서 해당 객체를 수정할 것임.

        // 직접적으로 수정하지 않게 하기 위해 새로운 객체 생성
        // selectedUser가 가지고 있는 정보들을 newInstance에 옮겨줌

        if (selectedUser != null) {
             User newInstance = new User();
             newInstance.setNo(selectedUser.getNo());
             newInstance.setId(selectedUser.getId());
             newInstance.setPwd(selectedUser.getPwd());
             newInstance.setAge(selectedUser.getAge());
             newInstance.setBloodType(selectedUser.getBloodType());
             newInstance.setHobbies(selectedUser.getHobbies().clone());
             // hobbies는 배열이기 때문에 값을 그대로 옮기면 똑같은 배열의 값이 그대로 넘어감.
            // 클론을 통해 복제해야 함.
            return newInstance;

        }
        System.out.println("입력하신 회원 번호에 해당하는 회원이 없습니다.");
        return null;
    }

    public void modifyUser(User user) {
        int result = userRepository.updateUser(user);  // 삽입, 수정, 삭제는 항상 값이 잘 전달되었는지 확인

        if (result == 1) {
            System.out.println("회원 정보 수정이 완료되었습니다.");
        } else {
            System.out.println("입력하신 회원 번호에 해당하는 회원이 없습니다.");
        }
    }
}
