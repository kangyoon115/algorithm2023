package Level0;

public class division {
    public static int solution(int num1, int num2) {
        double answer =(double) num1/num2*1000;
        return (int)answer;
    }

    public static void main(String[] args) {
        division di =new division();
        System.out.println(division.solution(3,2));
        System.out.println(division.solution(7,3));
        System.out.println(division.solution(1,16));
    }
}