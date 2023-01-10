package Level0;
/*
[영어가 싫어요]
영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

입출력 예
numbers	result
"onetwothreefourfivesixseveneightnine"	123456789
"onefourzerosixseven"	14067

 */
public class HateEng {
    public static long solution(String numbers) {
        long answer = 0;
        numbers = numbers.replace("zero","0");
        numbers = numbers.replace("one","1");
        numbers = numbers.replace("two","2");
        numbers = numbers.replace("three","3");
        numbers = numbers.replace("four","4");
        numbers = numbers.replace("five","5");
        numbers = numbers.replace("six","6");
        numbers = numbers.replace("seven","7");
        numbers = numbers.replace("eight","8");
        numbers = numbers.replace("nine","9");

        answer=Long.parseLong(numbers);
        return answer;
    }
    public static void main(String[] args) {
        HateEng hateEng = new HateEng();
        System.out.println(HateEng.solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(HateEng.solution("onefourzerosixseven"));

    }
}

/*
[다른 플이]
class Solution {
    public long solution(String numbers) {

            String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < numbers_arr.length; i++) {
                numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
            }

            long answer = Long.parseLong(numbers);
            return answer;
        }
}

 */