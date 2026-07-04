package main.java.kopo.programmers.Level_0;

public class RemainderCalculator {
    public static void main(String[] args) {
        /*
        정수 num1, num2가 매개변수로 주어질 때,
        num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
         */

        int num1 = 1;
        int num2 = 2;

        solution(num1, num2);
    }

        static int solution(int num1, int num2) {
            int answer = num1 %  num2;
            return answer;
            //static : 객체를 만들지 않아도 -> 이 기능을 사용할 수 있는 것임
            // static int solution (이게 메서드/ 함수/ 기능 정의한 거임.)
            // 지금은 메서드를 선언했다(기능/함수를 만들어서 쓰는건데
            // 원래는 sattic 없으면 new 해서 객체 만들어서 사용해야함.
            // static 그냥 가능만든것
            // 내 의구심 : 코드는 위 => 아래 그럼 호출 먼저 아니고 함수를 먼저 만들어야 하는거아닌가?
            // 이거는 ㅁ동시에 메모리에 올라감 / 그렇기에 호출 먼저하고 메서드 정의 가능.
        }
}
