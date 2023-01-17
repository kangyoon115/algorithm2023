package Level0;
/*
[중복된 숫자 개수]
정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

입출력 예
array	n	result
[1, 1, 2, 3, 4, 5]	1	2
[0, 2, 3, 4]	1	0

 */
public class MultipleNum {
    public static int solution(int[] array, int n){
        int answer=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MultipleNum multipleNum = new MultipleNum();
        System.out.println(MultipleNum.solution(new int[]{1,1,2,3,4,5},1));
        System.out.println(MultipleNum.solution(new int[]{0,2,3,4},1));
    }
}
