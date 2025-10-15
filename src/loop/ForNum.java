package loop;

public class ForNum {
    public static void main(String[] args) {
        int count;
        //for문은 조건이 맞을 때 블록 안 코드를 전부 실행한 뒤,
        //마지막에 증감식(count++)가 실행
        for (count = 1; count <= 10; count++) {//여기까지 1 //2회차때 3으로 시작
            count = count + 1; //여기서 카운트가2 //2회차때 4
            System.out.println(count);//카운트2 출력 후 위의 증감연산자가 실행 //카운트 2회차 4
        }
    }
}
