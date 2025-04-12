import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
//        Solution2480.solution(x,y,z);
        if(x == y && y == z){
            System.out.println(10000 + x * 1000);
        }else if(x == y || x == z){
            System.out.println(1000 + x * 100);
        }else if(y == z){
            System.out.println(1000 + y * 100);
        }else{
            int max = Math.max(x, Math.max(y,z));
            System.out.println(max * 100);
        }

    }
}