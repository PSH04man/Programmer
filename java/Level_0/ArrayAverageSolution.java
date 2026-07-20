public class ArrayAverageSolution {
    public static void main(String[] args) {

        /*
        정수 배열 numbers가 매개변수로 주어집니다.
        numbers의 원소의 평균값을 return하도록
        solution 함수를 완성해주세요.
         */

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print(solution(numbers));

    }
    static double solution(int[] numbers) {

            int hap = 0;

            for(int i = 0; i < numbers.length; i++) {
                hap += numbers[i];}

            double answer = (double) hap / (double) numbers.length;
            return answer;
    }

}
