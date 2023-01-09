package Level0;
/*
[종이 자르기]
머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.

 입출력 예
M	N	result
2	2	3
2	5	9
1	1	0
 */
public class PaperCut {
    public static int solution(int M, int N){
        int answer=0;
        answer=(M*N)-1;
        return answer;
    }
public static void main(String[] args) {
        PaperCut paperCut = new PaperCut();
        System.out.println(PaperCut.solution(2,2));
        System.out.println(PaperCut.solution(2,5));
        System.out.println(PaperCut.solution(1,1));
    }

}

/*
[정리]
2X2, 3X3, 4X4 의 형태에 규칙성을 파악하면 간단한 문제
2X2의 경우 3
3X3의 경우 8
4X4의 경우 15
 */