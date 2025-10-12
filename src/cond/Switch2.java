package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 1;

        int coupon;
        switch (grade) {
            //case부터 쭉 수행하다가 break에서 빠져나옴
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
