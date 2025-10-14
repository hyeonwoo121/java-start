package loop;

public class DoWhile1 {

    public static void main(String[] args) {
        int i = 10;
        while (i < 3) {
            System.out.println("현재 숫자는:" + i);
            i++;
        }
        //실행결과가 아무것도 안나옴
        //이유는 while문 안에 거짓이기때문에 조건문 밖으로 빠진다.
    }
}
