package problem;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("하나의 정수를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("하나의 정수를 다시한번 입력하세요");
        int num2 = sc.nextInt();

            if (num1 % 2 == 1) {
                System.out.println("첫번째 입력한 숫자 " + num1 + "는 홀수입니다");
            }else{
                System.out.println("첫번째 입력한 숫자 " + num1 + "는 짝수입니다");
            }
            if (num2 % 2 == 0) {
                System.out.println("두번째 입력한 숫자 " + num2 + "는 짝수입니다");
            }else{
                System.out.println("첫번째 입력한 숫자 " + num2 + "는 홀수입니다");
            }
        }
    }