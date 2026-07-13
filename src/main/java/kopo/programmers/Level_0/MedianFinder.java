package main.java.kopo.programmers.Level_0;

import java.util.Arrays;

public class MedianFinder {
    public static void main(String[] args) {

    /*
    중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때
    가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
    정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
    */

        int[] array = {1, 2, 7, 10, 11, -33, -259};

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {

        // 정렬 함수 사용하기. sort.()

        Arrays.sort(array);

        /*
        길이가 3이면 index 중앙이면 index 1이된다
        5면 2가 됨, 7이면 3
        규칙은 중앙값의 인덱스는 길이에의해서 변하게 된다.
        중앙값이 array.length =>
        길이가 2증가할 떄마다 중앙값 인덱스 1이 증가함.
        */

        int median = array.length / 2;
        return array[median];

    }

}
