package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        while(i <= 5) {
            if (i == 3) {
                i++;
                continue;
                //continue가 있으면 밑에줄은 다 무시되고 다시 while문으로 가게됨
            }
            System.out.println(i);
            i++;
        }
    }
}
