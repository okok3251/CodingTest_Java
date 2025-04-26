
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution3003.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chess = {1,1,2,2,2,8};
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for(int i=0; i<arr.length; i++){
            int c = chess[i] - arr[i];
            if(i > 0){
                bw.write(" " + c);
            }else{
                bw.write(c + "");
            }
        }
        bw.flush();
        bw.close();

    }
}
