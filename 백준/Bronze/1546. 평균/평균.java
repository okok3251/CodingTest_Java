
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution1546.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
//        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] arr = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 0;
        int maxV = 0;
        for(int i=0; i<count; i++){
            int a = Integer.parseInt(st.nextToken());
            if(maxV < a){
                maxV = a;
            }
            arr[idx++] = a;

        }
        double sum = 0;
        for(int i=0; i< arr.length; i++){
            double a = (double)arr[i] / maxV * 100;
            sum += a;
        }

        bw.write((sum / (double)count) + "");
        bw.flush();
        bw.close();
    }
}
