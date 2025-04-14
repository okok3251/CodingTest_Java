
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution10818.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for(int i=0; i<T; i++){
            int num = Integer.parseInt(arr[i]);
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();


    }
}
