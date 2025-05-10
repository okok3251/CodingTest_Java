
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution10789.solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] strArr = new String[5][15];
        for(int i=0; i<5; i++){
            String str = br.readLine();
            for(int j=0; j < str.length(); j++){
                char ch = str.charAt(j);
                if(ch == ' '){
                    break;
                }
                strArr[i][j] = ch + "";

            }
        }

        for(int i=0; i<strArr[0].length; i++){
            for(int j=0; j<strArr.length; j++){
                if(strArr[j][i] != null) {
                    bw.write(strArr[j][i]);
                }
            }
        }
        bw.flush();
        bw.close();
    }

}

