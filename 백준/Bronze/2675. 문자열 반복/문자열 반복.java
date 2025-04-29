
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution2675.solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            String[] strArr = br.readLine().split(" ");
            int count = Integer.parseInt(strArr[0]);
            String str = strArr[1];
            for(int j=0; j<str.length(); j++){
                char c = str.charAt(j);
                for(int k=0; k<count; k++){
                    bw.write(c + "");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }

}

