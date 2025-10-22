package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0; //상품이 저장될때마다 카운트, 아직 등록된 상품 없음

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {

                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue; // 상품을 더 이상 등록을 못할경우 다시 while문으로 돌아가야 한다.
                }

                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = scanner.nextLine(); //첫 번째부터  칸(0번)에 입력된문자 저장

                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = scanner.nextInt(); //첫 번째부터  칸(0번)에 입력된숫자 저장

                productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}