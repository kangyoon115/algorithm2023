package Level0;
/*
[배열의 평균값]
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

입출력 예
numbers	result
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	5.5
[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0

 */
public class Average {
    public static double solution(int[]numbers){
        double answer=0;
        float sum=0;
        for(int i=0;i< numbers.length;i++){
            sum+=numbers[i];
        }
        answer=sum/(numbers.length);
        return answer;
    }

    public static void main(String[] args) {
        Average average = new Average();
        System.out.println(Average.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(Average.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}
/*
[다른 풀이]

import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}

 */