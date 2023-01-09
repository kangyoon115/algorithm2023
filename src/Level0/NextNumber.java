package Level0;

/*
[다음에 올 숫자]
등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

 입출력 예
common	result
[1, 2, 3, 4]	5
[2, 4, 8]	16
 */
public class NextNumber {
    public static int solution(int[] common){
        int answer=0;

        int x = common[1]-common[0];
        int y = common[2]-common[1];

        if (x==y){
            answer = common[common.length-1]+y;
        } else{
            answer = common[common.length-1]* common[2]/common[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        NextNumber nextNumber = new NextNumber();
        System.out.println(NextNumber.solution(new int[]{1,2,3,4}));
        System.out.println(NextNumber.solution(new int[]{2,4,8}));
    }

}
/*
[정리]
등차수열 연속적인 수의 차가 일정한 수열
등비수열 연속적인 수의 비가 일정한 수열
 */