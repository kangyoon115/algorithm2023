package Level0;
/*
[짝수의 합]
정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

입출력 예
n	result
10	30
4	6

 */
public class EvenSum {
    public static int solution(int n) {
        int answer = 0;
            for(int i=1;i<=n;i++) {
                if(i%2==0){
                answer += i;
            }
        };

        return answer;
    }

    public static void main(String[] args) {
        EvenSum evenSum = new EvenSum();
        System.out.println(EvenSum.solution(10));
        System.out.println(EvenSum.solution(4));

    }
}
