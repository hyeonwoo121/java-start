package loop.NeonSign;

public class MovingNeon {

        public static void main(String[] args) throws InterruptedException {
            String text = "🌟 AKOM Advertising 🌟";

            while (true) {
                for (int i = 0; i < 20; i++) {
                    System.out.print("\r" + " ".repeat(i) + text);
                    Thread.sleep(100);
                }
                for (int i = 20; i > 0; i--) {
                    System.out.print("\r" + " ".repeat(i) + text);
                    Thread.sleep(100);
                }
            }
        }
    }


