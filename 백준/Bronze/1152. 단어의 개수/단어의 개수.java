import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution2675.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        bw.write(st.countTokens() + "");
        bw.flush();
        bw.close();

    }

}

