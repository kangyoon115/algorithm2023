package Level0;
/*
[저주의 숫자 3]
3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.

10진법	3x 마을에서 쓰는 숫자	10진법	3x 마을에서 쓰는 숫자
1	1	6	8
2	2	7	10
3	4	8	11
4	5	9	14
5	7	10	16

정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.

입출력 예
n	result
15	25
40	76
 */
public class Curse3 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Curse3 curse3 = new Curse3();
        System.out.println(Curse3.solution(15));
        System.out.println(Curse3.solution(40));
    }
}

/*
[정리]
*valueOf 함수는 입력받은 매개변수를 지정된 객체형으로 변환하여 반환
ex) Integer a = Integer.valueOf(7);
    결과값 a=7
1. 매개변수로 들어온 n까지 for문을 돌림
2. answer +1
3. 3의 배수이거나 "3"을 포함하고 있으면 answer를 그 다음 숫자로 넘어감
 */