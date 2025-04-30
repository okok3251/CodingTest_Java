
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution2908.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(reverse(st.nextToken()));
        int b = Integer.parseInt(reverse(st.nextToken()));

        bw.write(a > b ? a + "" : b + "");
        bw.flush();
        bw.close();

    }

    public static String reverse(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(str.length()-i-1);
            newStr.append(c);
        }
        return newStr.toString();
    }

}

