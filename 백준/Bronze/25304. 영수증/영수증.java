import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int last_val = scan.nextInt();
        int r = scan.nextInt();

//        Solution25304.solution(last_val, r);
        int sum = 0;
        for(int i=0; i<r; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            sum += (a * b);
        }
        System.out.println(sum == last_val ? "Yes" : "No");

    }
}
