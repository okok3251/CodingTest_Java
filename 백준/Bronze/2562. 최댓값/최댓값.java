
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution2562.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int maxIdx = 1;
        int maxV = Integer.parseInt(br.readLine());
        for(int i=2; i<=9; i++){
            int c = Integer.parseInt(br.readLine());
            if(c > maxV){
                maxV = c;
                maxIdx = i;
            }

        }
        bw.write(maxV + "\n" + maxIdx);
        bw.flush();
        bw.close();
    }
}
