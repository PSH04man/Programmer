public class ArrayReverser {
    public static void main(String[] args) {

        /*
        정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
        num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록
        solution 함수를 완성해주세요.
         */

        int[] num_list = {1, 2, 3, 4, 5};

        int[] result = solution(num_list);

        System.out.println(java.util.Arrays.toString(result));

    }

    static int[] solution(int[] num_list) {
        int i = 0;
        int[] answer = new int[num_list.length];

        for(int j = num_list.length -1; j >= 0; j--) {
            answer[i] = num_list[j];
            i++;
        }
        return answer;
    }
}