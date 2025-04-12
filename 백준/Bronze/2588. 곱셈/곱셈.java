import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        int div = 1;
        while (b > 0) {
            int n = a * (b%10);
            System.out.println(n);
            b /= 10;
            sum += (n * div);
            div *= 10;
        }
        System.out.println(sum);
    }
}

