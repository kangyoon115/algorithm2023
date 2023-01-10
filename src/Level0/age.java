package Level0;
/*
[나이 출력]
머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.

입출력 예
age	result
40	1983
23	2000

 */
public class age {
    public static int solution(int age) {
        int answer = 0;
        for (int i = 0; i < age; i++) {
            answer = 2022 - age;
        }
        return answer+1;
    }

    public static void main(String[] args) {
        age a = new age();
        System.out.println(age.solution(40));
        System.out.println(age.solution(23));

    }
}