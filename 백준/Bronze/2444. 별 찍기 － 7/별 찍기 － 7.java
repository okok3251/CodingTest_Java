
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            for (int j = T - i; j > 0; j--) {
                bw.write(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int i = T - 1; i > 0; i--) {
            for (int j = 0; j < T - i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}

