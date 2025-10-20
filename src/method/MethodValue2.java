package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int num1 = 5;//지역변수
        System.out.println("1. changeNumber 호출 전, num1: " + num1); //5
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1); //5
    }

    public static void changeNumber(int number) {
        // (int number)파라미터 안에 변수도 지역변수이다!
        System.out.println("2. changeNumber 변경 전, number: " + number); //5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number); //10
    }
}
