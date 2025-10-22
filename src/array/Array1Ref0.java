package array;

public class Array1Ref0 {
    //원본에서 배열로 바꾼형태
    public static void main(String[] args) {

        int[] students = {90, 80, 70, 60, 50}; //  {}괄호앞에 new int[] 생략가능

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = (double) total / 5;

        System.out.println(" 점수 총합 : " + total);
        System.out.println(" 점수 평균 : " + average);
    }
}
