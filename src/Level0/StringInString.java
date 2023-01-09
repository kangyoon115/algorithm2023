package Level0;
/*
[문자열 안에 문자열]
문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

입출력 예
str1	str2	result
"ab6CDE443fgh22iJKlmn1o"	"6CD"	1
"ppprrrogrammers"	"pppp"	2
"AbcAbcA"	"AAA"	2

 */
public class StringInString {
    public static int solution(String str1, String str2) {
        int answer = 0;

        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        StringInString stringInString = new StringInString();
        System.out.println(StringInString.solution("ab6CDE443fgh22iJKlmn1o","6CD"));
        System.out.println(StringInString.solution("ppprrrogrammers","pppp"));
        System.out.println(StringInString.solution("AbcAbcA","AAA"));
    }
}