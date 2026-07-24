public class CharacterRepeater {
    public static void main(String[] args) {

        String my_string = "hello";

        System.out.print(Solution.solution(my_string, 3));
    }
    class Solution {
        public static String solution(String my_string, int n) {

            String answer = "";
            for(int i = 0; i < my_string.length(); i++) {
                char hello = my_string.charAt(i);
                for(int k = 0; k < n; k++)
                    answer += hello;
            }
            return answer;
        }
    }
}

