public class LetterRemover {
    public static void main(String[] args) {
        Solution solver = new Solution();

        String my_string = "abcdef";
        String letter = "f";

        String result = solver.solution(my_string, letter);
        System.out.println("결과: " + result);
    }

    public static class Solution {
        public String solution(String my_string, String letter) {
            String answer;

            answer = my_string.replace(letter, "");

            return answer;
        }
    }
}