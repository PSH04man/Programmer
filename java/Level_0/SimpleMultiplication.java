public class SimpleMultiplication {
    public static void main(String[] args) {

        /*
        정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을
        return 하도록 solution 함수를 완성해주세요.
         */

        int num1 = 3;
        int num2 = 4;;
        System.out.println(solution(num1, num2));

    }

        static int solution(int num1, int num2) {
            return num1 * num2;
            // 원래는 return  answer 로 요거를 변수선언 했었는데 안하고 이렇게 해도 된다
            // 값을 반환하는게 중요한거고 변수에 저장해서
            // 반환 하는 것보다 바로 반환하는게 더 빠르고 메모리 안먹고 더 좋다
            // 근데 이런 상황이 많지는 않다 할 수 있으면 하면 좋다.
        }

}
