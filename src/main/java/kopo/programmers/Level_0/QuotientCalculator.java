package main.java.kopo.programmers.Level_0;

public class QuotientCalculator {
    public static void main(String[] args) {
        /*
        정수 num1, num2가 매개변수로 주어질 때,
        num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
         */

        int num1 = 10;
        int num2 = 5;
        int result = 2;

        System.out.print(solution(num1, num2));
        //이게 메서드를 호출하는 것.
    }

    public static int solution(int num1, int num2) {
            int answer = num1 / num2;
            return answer;
            //이게 메서드(기능, 함수를 정의한 것.)
    }
}