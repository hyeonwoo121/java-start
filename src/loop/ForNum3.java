package loop;

//문제: 누적 합 계산
//반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성해보세요. 이때, sum이라는
//변수를 사용하여 누적합을 표현하고, i라는 변수를 사용하여 카운트(1부터max까지 증가하는 변수)를 수행해야한다.
public class ForNum3 {
    public static void main(String[] args) {
        int max = 3; //반복의 끝(최대값)
        int sum = 0; // 누적합 저장 변수

        for (int i = 1; i <= max; i++){ // i는 1부터 100까지 반복
            sum += i; //i를 sum에 계속 더함
        }
        System.out.println(sum); //최종 합 출력
    }
}
