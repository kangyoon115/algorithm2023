package Level0;
/*
[외계어 사전]
PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다. 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다. spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.

입출력 예
spell	dic	result
["p", "o", "s"]	["sod", "eocd", "qixm", "adio", "soo"]	2
["z", "d", "x"]	["def", "dww", "dzx", "loveaw"]	1
["s", "o", "m", "d"]	["moos", "dzx", "smm", "sunmmo", "som"]	2

 */
public class AlienDic {
    public static int solution(String[] spell, String[] dic) {
        int answer = 0;
        for (int i = 0; i < dic.length; i++) {
            int check = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].indexOf(spell[j]) == -1) {
                    check = -1;
                    answer = 2;
                    break;
                }
            }
            if (check == 0) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}

/*
[정리]
1. dic의 길이만큼 for문 돌림
2. 확인용변수 check
3. spell의 길이만큼 for문 돌림
4. 만약 spell의 j번째 알파벳이 dic의 i번째 단어에 포함되어있지 않으면 chek -1, answer 2로 초기화하고 for문 종료

 */