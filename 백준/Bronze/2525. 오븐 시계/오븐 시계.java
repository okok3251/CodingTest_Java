import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
//        Solution2525.solution(h,m,a);
        int addH = a / 60;
        int addM = a % 60;

        if(m + addM >= 60){
            addH++;
            addM -= 60;
        }
        int new_h = h + addH;
        System.out.print(new_h >= 24 ? new_h-24 : new_h);
        System.out.print(" ");
        System.out.print(m + addM);

    }
}
