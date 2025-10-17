package loop.NeonSign;

public class InfiniteStar {
    public static void main(String[] args) throws InterruptedException {
        int rows = 50; // 별이 몇 줄까지 늘어날지 (적당히)
        while (true) { // 무한 루프
            // ① 별이 1개씩 늘어나는 구간
            for (int i = 1; i <= rows; i++) {
                printStars(i);
                Thread.sleep(50); // 별이 찍히는 속도 (0.05초)
            }

            // ② 별이 1개씩 줄어드는 구간
            for (int i = rows - 1; i >= 1; i--) {
                printStars(i);
                Thread.sleep(50);
            }
        }
    }

    // 별 한 줄 찍기 함수
    public static void printStars(int count) {
        // 콘솔을 지우고 커서를 맨 위로 (터미널 ANSI 코드)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // 별 출력
        for (int j = 0; j < count; j++) {
            System.out.print("* ");
        }
        System.out.println(); // 줄바꿈
    }
}
