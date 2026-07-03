package main.java.kopo.programmers.Level_0;

public class BirthYearCalculator {
    public static void main(String[] args) {
        /*
        머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
        2022년 기준 선생님의 나이 age가 주어질 때,
        선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
         */

        int answer = solution(40);
        System.out.print(answer);
    }
        public static  int solution(int age) {
            return 2022 - age + 1;

    }
}
