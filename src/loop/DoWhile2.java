package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        //do while문은 최초 한번은 코드블럭을 꼭 실행해야 할때사용
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
