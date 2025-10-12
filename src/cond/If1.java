package cond;

public class If1 {

    public static void main(String[] args) {
        int age = 20; //사용자 나이

        if (age >= 18){
            System.out.println("성인입니다");
        }

        if (age < 18){
            System.out.println("미성년자입니다");
        } // if문 괄호()안에 내용이 false이면 무시가됨 오직 true에만 반응!
    }
}
