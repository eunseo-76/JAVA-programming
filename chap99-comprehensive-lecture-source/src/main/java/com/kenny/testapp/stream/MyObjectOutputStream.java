package com.kenny.testapp.stream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    /* 유저 정보를 추가 입력하여 파일에 쓸 때는 stream header 정보가 출력되지 않도록 메소드 재작성 */
    @Override
    protected void writeStreamHeader() throws IOException {
//        super.writeStreamHeader(); <-- 이 부분 삭제
    }
}

// ObjectOutputStream을 쓰되 커스터마이징 할 계획
// ObjectOutputStream을 상속한 후, 구현해야하는 내용을 작성 (super(out)...
// 커스터마이징 할 부분을(writeStreamHeader) 오버라이딩함
// super.writeStreamHeader() 하면 맨 앞에 헤더 정보가 출력됨. 헤더 정보가 출력되지 않도록 이 부분을 삭제하여 오버라이딩 한다.