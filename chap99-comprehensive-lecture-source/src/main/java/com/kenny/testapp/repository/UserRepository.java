package com.kenny.testapp.repository;

import com.kenny.testapp.aggregate.BloodType;
import com.kenny.testapp.aggregate.User;
import com.kenny.testapp.stream.MyObjectOutputStream;

import java.io.*;
import java.util.ArrayList;

/* 데이터와 입출력(CRUD)를 위해 만들어지며 성공 또는 실패 여부를 반환 */
public class UserRepository {

    // 메모리 상에 올라와 있을 때 저장할 위치
    private final ArrayList<User> userList = new ArrayList<>();
    private static final String FILE_PATH = "src/main/java/com/kenny/testapp/db/userDB.dat";

    public UserRepository() {
        // UserService 에서 UserRepository가 생성될 때 동작함
        /* 객체 생성 시 동작할 내용
        * 1. 초기 회원 3명을 넣어 놓는다.
        * 2. 파일로부터 회원 정보를 가져온다.
        * 3. userList에 담는다.
        * */

        File file = new File(FILE_PATH);

        // 파일이 존재하지 않으면 아래 값들을 파일에 작성하라
        if (!file.exists()) {
            ArrayList<User> users = new ArrayList<>();
            users.add(new User(1, "user01", "pass01", 20, new String[]{"발레", "수영"}, BloodType.A));
            users.add(new User(2, "user02", "pass02", 30, new String[]{"게임"}, BloodType.AB));
            users.add(new User(3, "user03", "pass03", 40, new String[]{"영화감상", "독서", "명상"}, BloodType.O));

            saveUsers(file, users); // 파일에 users 객체들을 저장
        }

        loadUsers(file);

    }

    private void loadUsers(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            while (true) {
                userList.add((User) ois.readObject());  // Object -> User 타입으로 형 변환
            }

        } catch (EOFException e) {  // 회원이 몇 명인지 모르므로 파일의 끝을 읽으면 회원 정보 모두 로딩 완료
            System.out.println("회원 정보를 모두 로딩하였습니다.");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void saveUsers(File file, ArrayList<User> users) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {

            for (User user : users) {
                oos.writeObject(user);
            }

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<User> selectAllUsers() {
        return userList;
    }

    public User selectUserByNo(int no) {
        // 파일에 있는 값을 읽어오게 했기 때문에 userList에는 값들이 들어있음.
        for (User user : userList) {
            if (user.getNo() == no) {
                return user;    // no와 일치하는 객체 반환
            }
        }
        return null;    // no와 일치하는 객체가 없는 경우 null 반환
    }

    public int selectedLastUserNo() {

        User lastUser = userList.get(userList.size() - 1);
        return lastUser.getNo();

//        return userList.size();
        // userList에 현재 3개의 요소가 있음.
        // userList.size() + 1 하면 4번째에 쓸 수 있음.
        // 하지만 1번 유저가 삭제되면 사이즈는 2이지만 3번에 넘버링을 해야 함(이미 3번이 존재하는데도)
    }

    public int insertUser(User user) {

        // 원래 있던 파일에 유저를 추가할 수도 있지만(덮어쓰기) 이 프로그램은 이어쓰기를 함
        // 파일의 맨 앞에 실제 유저 정보와 상관 없는 헤더 정보가 들어가 있음.
        // ObjectOutputStream을 쓰면 헤더 정보가 같이 들어감.
        // 그렇기 때문에 원하는 String 클래스를 추가해서 사용함

        int result = 0;

        try(MyObjectOutputStream moos = new MyObjectOutputStream((new FileOutputStream(FILE_PATH, true)))) {

            moos.writeObject(user); // 파일에 이어쓰기
            userList.add(user); // 현재 관리되고 있는 메모리에 추가하기
            result = 1;

            // exception이 발생하면 파일에 쓰지도, 메모리에 추가도 하지 않는다.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
        // exception 발생 : 0
        // 정상 수행 : 1

    }
}
