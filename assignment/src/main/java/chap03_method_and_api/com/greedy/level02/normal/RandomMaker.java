package chap03_method_and_api.com.greedy.level02.normal;
import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max){
        // 최소값부터 최대값까지 범위의 난수 반환함
        int result = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(result);
        return result;
    }

    public static String randomUpperAlphabet(int length){
        // 인자의 길이 만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환함
        Random random = new Random();
        char alphabet = 0;
        int randomInt = 0;
        String result = "";
        for(int i=0; i<length; i++){
            randomInt = random.nextInt(26) + 65; // 65부터 26개 범위의 랜덤 숫자 생성
            alphabet = (char) randomInt;
            result = result + alphabet; // 문자열 + 문자 가능
        }
        System.out.println(result);
        return result;
    }
    public static String rockPaperScissors(){
        // 가위, 바위, 보 중 한 가지를 반환함
        Random random = new Random();
        String result = "";
        int randomInt = random.nextInt(3);
        if(randomInt == 0){
            result = "가위";
        }else if(randomInt == 1){
            result = "바위";
        }else{
            result = "보";
        }
        // Q. if나 case 안 쓰고 어떻게 하지?
        System.out.println(result);
        return result;
    }
    public static String tossCoin() {
        // 동전의 앞면, 뒷면 중 한 가지를 반환함
        Random random = new Random();
        String result = "";
        int randomInt = random.nextInt(2);
        if(randomInt == 1) {
            result = "앞면";
        }else{
            result = "뒷면";
        }
        System.out.println(result);
        return result;
    }
}
