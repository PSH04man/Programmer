package main.java.kopo.programmers.Level_0;

public class OddNumberArrayGenerator {
    public static void main(String[] args) {
        /*
        정수 n이 매개변수로 주어질 때,
        n 이하의 홀수가 오름차순으로 담긴 배열을
        return하도록 solution 함수를 완성해주세요.
         */

        int n = 10;

        //1. solution 함수가 완성한 배열 result 에 넘겨받는다.
        int[] result = solution(n);

        //2. 받은 배열의 0번 칸부터 끝까지 돌면서 내용물 하나씩 출력.
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    //3. 이것도 사실 한 번 더 봐야함 어떻게 짜는지 모르겠음 논리적인 구조를 한 번 더 확인해봐야할 것 같음.
    public static int[] solution(int n) {
            int index = 0;
            int[] answer = new int[(n + 1 ) / 2];

            for(int i = 1; i<= n; i+=2){
                answer[index] = i;
                index++;
            }
            return (answer);

    }
}
