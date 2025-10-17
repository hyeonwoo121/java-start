package loop.NeonSign;

public class NeonStars {

        public static void main(String[] args) throws InterruptedException {
            String[] colors = {
                    "\u001B[31m", // 빨강
                    "\u001B[33m", // 노랑
                    "\u001B[32m", // 초록
                    "\u001B[36m", // 하늘색
                    "\u001B[35m"  // 보라
            };
            String reset = "\u001B[0m";
            int maxStars = 6;

            while (true) {
                for (String color : colors) {
                    for (int i = 1; i <= maxStars; i++) {
                        System.out.print("\r" + color); // 색상 변경
                        for (int j = 0; j < i; j++) {
                            System.out.print("* "); // 별 사이 공백
                        }
                        System.out.print(reset);
                        Thread.sleep(200);
                    }
                }
            }
        }
    }

