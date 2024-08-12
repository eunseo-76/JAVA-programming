package chap11_io.com.kenny.level02.normal;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        int num = 0;
        String newFileName = "";

        // 파일 개수, 파일 이름 입력받기
        try(BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))){

            System.out.print("병합할 파일 개수 입력 : ");
            num = Integer.parseInt(br1.readLine());
            String arr[] = new String[num];
            for (int i = 0; i < num; i++) {
                System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
                arr[i] = br1.readLine();
            }
            System.out.print("병합될 파일명 입력 :");
            newFileName = br1.readLine();

            // 파일을 읽어 새 파일에 복사하기
            for(int i=0;i<num;i++){
                try(BufferedReader br2 = new BufferedReader(new FileReader(arr[i]));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName, true))){
                    int character;
                    while((character = br2.read()) != -1){
                        bw.write(character);
                    }
                    System.out.println("파일 복사 완료");
                } catch (FileNotFoundException e){
                    // 이렇게 하는 경우 오류 발생 시 newFileName 객체를 지우거나, 파일의 내용을 지우거나 해야 함
                    // 이렇게 하지 말고, br만 3번 for문으로 반복하고 bw는 for문 바깥에서 한 번에 하는 게 낫다
                    System.out.print("오류 : (지정된 파일을 찾을 수 없습니다)");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
