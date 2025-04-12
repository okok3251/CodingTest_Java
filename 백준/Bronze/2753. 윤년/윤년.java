import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
//        Solution2753.solution(a);
        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

}