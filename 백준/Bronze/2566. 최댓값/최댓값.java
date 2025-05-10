import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution2566.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max_i = 0;
        int max_j = 0;
        int max_v = 0;
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                int a = Integer.parseInt(st.nextToken());
                if(a >= max_v){
                    max_i = i+1;
                    max_j = j+1;
                    max_v = a;
                }
            }
        }
        bw.write(max_v + "");
        bw.newLine();
        bw.write(max_i + " " + max_j);
        bw.flush();
        bw.close();

    }

}

