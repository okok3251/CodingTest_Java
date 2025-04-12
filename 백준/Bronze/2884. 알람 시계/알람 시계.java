import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
//        Solution2884.solution(a,b);
        int HtoM = (h * 60) + m - 45;
        if(h == 0 && m < 45){
            System.out.print(23);
            System.out.print(" ");
            System.out.print(60 + (HtoM%60));
        }else{
            System.out.print(HtoM / 60 );
            System.out.print(" ");
            System.out.println(HtoM % 60);
        }
    }

}