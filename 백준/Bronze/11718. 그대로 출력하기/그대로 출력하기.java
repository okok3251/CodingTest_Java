import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution2908.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while((str=br.readLine()) != null){
            bw.write(str);
            bw.newLine();
            bw.flush();

        }
        bw.close();
    }

}

