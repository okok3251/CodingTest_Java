
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution1316.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<T; i++){
            String s = br.readLine();
            boolean[] check = new boolean[26];
            boolean isGroup = true;
            int prev = -1;

            for(int j=0; j<s.length(); j++){
                int c = s.charAt(j);
                if(check[c - 97]){
                    if(c != prev){
                        isGroup = false;
                    }
                }else{
                    check[c-97] = true;
                    prev = c;
                }
            }
            if(isGroup){
                count++;
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();

    }

}

