package problem;

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args){
        int maxProducts = 10;
        String [] productNames = new String[maxProducts];
        int [] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요 :");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {

                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.println("상품 이름을 입력하세요 : ");
                productNames[productCount] = sc.nextLine();

                System.out.println("상품 가격을 입력하세요 : ");
                productPrices[productCount] = sc.nextInt();

                productCount++;

            } else if (option == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            }else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("올바른 숫자를 입력하세요");
            }
        }
    }
}

