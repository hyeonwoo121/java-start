package loop.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int answer = rand.nextInt(100) + 1;  // 1~100 사이 랜덤 숫자
        int tries = 0;

        System.out.println("🎮 [숫자 맞추기 게임]");
        System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");

        while (true) {
            System.out.print("👉 숫자 입력: ");
            int guess = sc.nextInt();
            tries++;

            if (guess > answer) {
                System.out.println("📉 너무 큽니다!");
            } else if (guess < answer) {
                System.out.println("📈 너무 작습니다!");
            } else {
                System.out.println("🎯 정답입니다! (" + tries + "회 시도)");
                break;
            }
        }

        System.out.println("게임 종료! 감사합니다 😊");
    }
}
