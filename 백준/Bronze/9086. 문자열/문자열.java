
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution9086.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String s = br.readLine();
            char first = s.charAt(0);
            char last = s.charAt(s.length()-1);
            bw.write(first + "" + last);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
