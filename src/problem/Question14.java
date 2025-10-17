package problem;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        //ScannerWhile4 에 정답이 있음
        int input = 0;
        int totalCost = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1:상품 입력, 2:결제, 3:프로그램 종료");
        input = sc.nextInt();//여기서 1 + 엔터 입력 but 숫자1만 인식 후 엔터(개행)는 버퍼에 남게됨
        sc.nextLine();//한 줄(엔터)을 읽어서 없앤다 이게 없으면 16행에 nextline에서 개행엔터를 인식하고
                      //빈 문자열을 보여주게되고 끝이남

        while (input == 1) {
            System.out.println("상품명을 입력하세요");
            String item = sc.nextLine();
            System.out.println("상품의 가격을 입력하세요");
            int price = sc.nextInt();
            System.out.println("구매수량을 입력하세요");
            int quantity = sc.nextInt();
            int sum = price*quantity;
            System.out.println("상품명 : " + item + " 가격 : " + price + " 수량 : " + quantity +" 합계 : "+ sum);
            totalCost += sum;

            System.out.println("1:상품 입력, 2:결제, 3:프로그램 종료");
            input = sc.nextInt();
            sc.nextLine();
            if (input == 2) {

                System.out.println("총 비용 :　" + totalCost);
            }
        }
        System.out.println("1:상품 입력, 2:결제, 3:프로그램 종료");
        input = sc.nextInt();
        sc.nextLine();
        if (input == 3){
            System.out.println("프로그램을 종료합니다.");
        }
    }
}