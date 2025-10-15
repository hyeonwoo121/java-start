package loop.NeonSign;

public class NeonSign {

        public static void main(String[] args) throws InterruptedException {
            String text = "💡 AKOM 광고회사 🗼 신주쿠점 💡";
            String[] colors = {
                    "\u001B[31m", // 빨강
                    "\u001B[33m", // 노랑
                    "\u001B[32m", // 초록
                    "\u001B[36m", // 하늘색
                    "\u001B[35m"  // 보라
            };
            String reset = "\u001B[0m";

            while (true) {
                for (String color : colors) {
                    System.out.print("\r" + color + text + reset); // \r: 줄 처음으로 이동
                    Thread.sleep(300); // 0.3초 간격으로 색 바꾸기
                }
            }
        }
    }

