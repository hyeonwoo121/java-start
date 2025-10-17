package loop.NeonSign;

public class SimpleAnimation {
    public static void main(String[] args) throws InterruptedException {
        String[] frames = {
            "●        ",
            " ●       ",
            "  ●      ",
            "   ●     ",
            "    ●    ",
            "     ●   ",
            "      ●  ",
            "       ● ",
            "        ●",
            "       ● ",
            "      ●  ",
            "     ●   ",
            "    ●    ",
            "   ●     ",
            "  ●      ",
            " ●       ",
            "●        "
        };

        while (true) {
            for (String frame : frames) {
                System.out.print("\r" + frame); // 같은 줄 덮어쓰기
                Thread.sleep(100);              // 0.1초마다 갱신
            }
        }
    }
}