package problem;

public class Question {
    public static void question() {
         int num1 = 4;
         int num2 = 3;

        System.out.println(num1 + "+" + num2 );
        System.out.println(num1 + "-" + num2 );
        System.out.println(num1 + "*" + num2 );
    }

    public static void main(String[] args) {
        Question.question();
    }

    public static class Question2 {

        public static void main(String[] args){
            int num1 = 10;
            int num2 = 20;
            int sum = num1 + num2;

            System.out.println(sum);
        }
    }
}
