
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution5597.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] student = new int[30];
        for(int i=0; i<28; i++){
            int c = Integer.parseInt(br.readLine());
            student[c-1] = 1;
        }

        for(int i=0; i<student.length; i++){
            if(student[i] == 0){
                int a = i+1;
                bw.write("" + a);
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}

