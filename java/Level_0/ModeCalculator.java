package main.java.kopo.programmers.Level_0;

public class ModeCalculator {
    public static void main(String[] args) {

        /*
        최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
        정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
        최빈값이 여러 개면 -1을 return 합니다.
         */

        // 1. 테스트할 배열 데이터를 직접 만들어 줍니다.
        int[] array = {1, 2, 3, 3, 3, 4};

        // 2. solution 함수에 배열 변수의 '이름'만 넣고, 괄호 짝을 맞춰 출력합니다.
        // (print 대신 println을 쓰면 출력 후 깔끔하게 줄바꿈이 됩니다.)
        System.out.println(solution(array));

    }

    public static int solution(int[] array) {

        // 1. 숫자의 등장 횟수를 기록할 빈 출석부 (배열)를 만듭니다.
        int[] counts = new int[1000];

        // 2. 주어진 원래 숫자들(array)을 처음부터 끝까지 하나씩 확인합니다.
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            counts[num] += 1;
        }

        // 3. 출석부 기록이 끝났으니, 이제 '가장 큰 횟수'와 '그때의 숫자'를 찾을 차례입니다.
        int maxCount = 0;
        int mode = 0;

        // 출석부 📋(counts)의 0번 방부터 끝(999번 방)까지 쭉 확인합니다.
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mode = i;
            }
            else if (counts[i] == maxCount) {
                mode = -1;
            }
        }

        // 4. 모든 확인이 끝나고 최종적으로 mode에 저장된 값을 반환합니다.
        return mode;
    }
}