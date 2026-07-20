import java.util.Arrays;

public class FractionAddition {
    public static void main(String[] args) {
        /*
        첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
        두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
        두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을
         return 하도록 solution 함수를 완성해보세요.
         */

        // 2. solution 메서드에 값 넣어서 실행 (예: 1/2 + 3/4)
        int[] result = solution(1, 2, 3, 4);

        // 3. 결과 출력 (Arrays.toString을 써야 배열 안의 숫자가 보입니다)
        System.out.println(Arrays.toString(result));
    }
        public static int[] solution(int BJ1, int BM1, int BJ2, int BM2) {

            int resultbm = BM1 * BM2; //공통 분모 만들기 (두 분모 곱하기)
            int rbj1 = BJ1 * BM2; //분자1 크기 맞추기
            int rbj2 = BJ2 * BM1; //분자2 크기 맞추기

            int resultbj = rbj1 + rbj2; // 분자1 + 분자2; (공통된 분자끼리 더하기)

            int max = 0;

            int good = 0;

            if (resultbj < resultbm) {
                good = resultbj;
            } else {
                good = resultbm;
            }

            for (int i = 1; i <= good; i++) {
                if (resultbj % i == 0 && resultbm % i == 0)
                    max = i;
            }

            int finalBj = resultbj / max;
            int finalBm = resultbm / max;

            int[] answer = {finalBj, finalBm};
            return answer;

        }
}
