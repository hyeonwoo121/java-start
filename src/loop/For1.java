package loop;

public class For1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            //int i = 1  -> 초기식  실행순서 1번!!
            //i <= 10 -> 조건식 실행순서 2번!!
            System.out.println(i);
            //콘솔입력 실행순서3번!! -> 그다음 i++ 증감식 실행순서4번!!
            //그다음 조건식 2번부터 다시 반복!!



        }
    }
}
