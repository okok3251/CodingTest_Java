
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution1157.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];

        String str = br.readLine().toUpperCase();
        for(int i=0; i<str.length(); i++){
            int c = str.charAt(i)-65;
            alphabet[c] += 1;
        }

        int max_alpha = 0;
        int max_count = 0;
        for(int i=0; i<alphabet.length; i++){
            if(alphabet[i] > max_alpha) {
                max_alpha = alphabet[i];
                max_count = 1;
            }
            else if(alphabet[i] == max_alpha){
                max_count++;
            }
        }

        if(max_count > 1){
            bw.write("?");
        }else{
            int max_idx = 0;
            for(int i=0; i<alphabet.length; i++){
                if(alphabet[max_idx] < alphabet[i] && alphabet[i] == max_alpha){
                    max_idx = i;
                }
            }
            char max_v = (char)(max_idx + 65);
            bw.write(max_v + "");
        }

        bw.flush();
        bw.close();
    }

}

