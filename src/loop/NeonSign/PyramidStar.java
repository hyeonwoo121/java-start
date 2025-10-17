package loop.NeonSign;

public class PyramidStar {

    public static void main(String[] args) {
        int rows = 3; // 피라미드 높이

        for (int i = 1; i <= rows; i++) {
            // 1️⃣ 공백 찍기 (왼쪽 여백)
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // 2️⃣ 왼쪽 별 찍기
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 3️⃣ 오른쪽 별 찍기
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            // 4️⃣ 줄바꿈
            System.out.println();
        }
    }
}
