
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution10807.solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        String V = br.readLine();
        int count = 0;
        for(int i=0; i<T; i++){
            if(array[i].equals(V)){
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}
