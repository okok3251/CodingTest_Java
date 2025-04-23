
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution11720.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for(int i=0; i<T; i++){
            int c = s.charAt(i)-48;
            sum += c;
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
