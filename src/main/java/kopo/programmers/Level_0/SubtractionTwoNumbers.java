package main.java.kopo.programmers.Level_0;

public class SubtractionTwoNumbers {
    public static void main(String[] args) {
        /*
        정수 num1과 num2가 주어질 때,
        num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
         */

        int num1 = 2;
        int num2 = 3;
        System.out.println(solution(num1, num2));
    }

    static  int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }
}
