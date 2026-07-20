import java.util.Arrays; // 배열을 예쁘게 출력하기 위해 필요해요!

public class IceAmericano {
    public static void main(String[] args) {
        int myMoney = 15000;

        int[] result = solution(myMoney);

        System.out.println("가진 돈: " + myMoney + "원");
        System.out.println("결과 [잔 수, 남는 돈]: " + Arrays.toString(result));
    }

    static int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}