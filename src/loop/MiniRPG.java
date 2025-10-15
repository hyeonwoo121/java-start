package loop;

import java.util.Random;
import java.util.Scanner;

public class MiniRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playerHP = 30;
        int monsterHP = 25;

        System.out.println("⚔️ 미니 RPG 전투 시작!");
        System.out.println("플레이어 HP: " + playerHP + " | 몬스터 HP: " + monsterHP);

        while (playerHP > 0 && monsterHP > 0) {
            System.out.println("\n[1] 공격  [2] 회복  [3] 도망");
            System.out.print("👉 선택: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                int dmg = rand.nextInt(10) + 5; // 5~14
                System.out.println("💥 몬스터에게 " + dmg + " 데미지!");
                monsterHP -= dmg;
            } else if (choice == 2) {
                int heal = rand.nextInt(10) + 5;
                System.out.println("💚 체력을 " + heal + " 회복!");
                playerHP += heal;
            } else if (choice == 3) {
                System.out.println("🏃 도망쳤습니다!");
                break;
            }

            if (monsterHP > 0) {
                int dmg = rand.nextInt(8) + 3;
                System.out.println("👹 몬스터의 반격! " + dmg + " 데미지!");
                playerHP -= dmg;
            }

            System.out.println("플레이어 HP: " + playerHP + " | 몬스터 HP: " + monsterHP);
        }

        if (playerHP <= 0) System.out.println("💀 패배...");
        else if (monsterHP <= 0) System.out.println("🎉 승리!");
    }
}
