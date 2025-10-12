package problem;

public class Question9 {
    public static void main(String[] args) {
        int dolloar = -1;

        if(dolloar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if (dolloar == 0) {
            System.out.println("환전할 금액이 없습니다");
        }else{
            int won = dolloar * 1300;
            System.out.println("환전 금액은 :" + won + "입니다.");
        }
    }
}
