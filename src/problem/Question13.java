package problem;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int num = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while (true) {
           num = sc.nextInt();
            if (num == -1) {
                break;
                }
            sum += num;
            count ++;
            //System.out.println("합계는 " + sum + "입니다");
        }
        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계 " + sum);
        System.out.println("입력한 숫자들의 평균 " + average);
    }
}