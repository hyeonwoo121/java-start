package method;

public class MethodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber(num1);//changeNumber를 호출한다. num1 = 5
        System.out.println("1. changeNumber 호출 후, num1: " + num1);// 여기서 num1 계산결과는 5임 왜냐하면
        //자바는 항상 값을 복사해서 전달하기 때문에 num2의 값을 바꾸더라도 num1에는 영향을 주지 않는다.
    }

    public static void changeNumber(int num2) {
        //(int num2) -> num2 = 5
        System.out.println("2. changeNumber 변경 전, num2: " + num2);
        num2 = num2 * 2 ;//num2에 5를 곱한다.
        System.out.println("2. changeNumber 변경 후, num2: " + num2);//num2에 계산결과 10을 대입한다
    }
}