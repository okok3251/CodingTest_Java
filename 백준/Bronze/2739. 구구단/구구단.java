import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
//        Solution2739.solution(x);
        for(int i=1; i<=9; i++){
            System.out.println(x + " * " + i + " = " + x*i);
        }
    }
}
