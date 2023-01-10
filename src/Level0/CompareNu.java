package Level0;
/*
[숫자 비교하기]
정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

입출력 예
num1	num2	result
2	3	-1
11	11	1
7	99	-1

 */
public class CompareNu {
    public static int solution(int num1, int num2) {
        int answer = 0;
        if(num1==num2){
            answer=1;
        }else{
            answer=-1;
        }
        return answer;
    }

    public static void main(String[] args) {
        CompareNu compareNu = new CompareNu();
        System.out.println(CompareNu.solution(2,3));
        System.out.println(CompareNu.solution(11,11));
        System.out.println(CompareNu.solution(7,99));
    }
}
