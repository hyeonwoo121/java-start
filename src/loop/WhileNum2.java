package loop;

public class WhileNum2 {
    public static void main(String[] args) {
       int num = 2;
       int count = 1;
       while(count <= 10){ //반복횟수 //10번 반복하고싶다면 count 10
           System.out.println(num);
           num ++;
           num += 1; //num을 2씩 증가 
           count ++;
       }
    }
}
