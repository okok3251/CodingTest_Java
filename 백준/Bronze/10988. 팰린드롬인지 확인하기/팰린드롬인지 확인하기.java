
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution10988.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String revs = reverse(s);

        bw.write((s.equals(revs) ? "1" : "0"));
        bw.flush();
        bw.close();
    }
    public static String reverse(String s){
        String str = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(s.length()-i-1);
            str += c;
        }
        return str;
    }

}

