import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
//        Solution8393.solution(x);
        int sum = 0;
        for(int i=1; i<=x; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
