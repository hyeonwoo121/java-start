package problem;

import java.util.Scanner;

public class Question16 {
    //ATM 계산 문제
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int balance = 0;
        while (true) {
            System.out.println("------------------------------------");
            System.out.println(" 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료 ");
            System.out.println("------------------------------------");

            int option = sc.nextInt();
            //sc.nextLine(); 여기서는 불필요 왜냐면 문자열이 따로 입력이 안되었기때문

            System.out.println("선택 : " + option);
            if (option == 1) {

                System.out.println("입금액을 입력하세요 : ");
                int deposit = sc.nextInt();
                //sc.nextLine();
                balance += deposit;

            System.out.println(deposit+"원을 입금하였습니다." + "현재 잔액 : " + balance +"원");
            }

            else if (option == 2) {

                System.out.println("출금액을 입력하세요 : ");
                int amount = sc.nextInt();
                //sc.nextLine();
                balance = input(balance, amount);
            }
            else if (option == 3) {
                System.out.println(" 현재 잔액: " +balance +" 원 ");
            }
            else if (option == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }

        }
    }
    public static int input(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount+"원을 출금하였습니다." + "현재 잔액 : " + balance +"원");
        }else{
            System.out.println(amount+"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}

