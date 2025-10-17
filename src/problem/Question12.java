package problem;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 0;
        int quantity = 0;

        while (true) {
                System.out.println("상품의 가격을 입력하세요(-1을 입력하면 종료) :");
                price = sc.nextInt();
            if (price == -1) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
                System.out.println("구매하려는 수량을 입력하세요(-1을 입력하면 종료) :");
                quantity = sc.nextInt();
            if (quantity == -1) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
                int total = price * quantity;
                System.out.println("총 비용 : " + total);
                break; // 무한으로 콘솔찍고싶으면 break를 삭제
        }
    }
}