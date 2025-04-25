
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution10809.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabet = new int[26];
        for(int i=0; i<alphabet.length; i++){
            alphabet[i] = -1;
        }

        String s = br.readLine();
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i) - 97;
            if(alphabet[c] == -1){
                alphabet[c] = i;
            }

        }

        for(int i=0; i<alphabet.length; i++){
            if(i > 0){
                bw.write(" " + alphabet[i]);
            }else{
                bw.write(alphabet[i]+"");
            }
        }
        bw.flush();
        bw.close();
    }
}
