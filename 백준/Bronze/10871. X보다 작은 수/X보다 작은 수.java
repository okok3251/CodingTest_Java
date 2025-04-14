
import java.io.*;
import java.util.StringTokenizer;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
//        Solution10871.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] condition = br.readLine().split(" ");
        String[] array = br.readLine().split(" ");
        int value = Integer.parseInt(condition[1]);
        boolean first = true;
        for(int i=0; i<array.length; i++){
            int c = Integer.parseInt(array[i]);
            if(c < value){
                if(first){
                    bw.write(c + "");
                    first = false;
                }
                else{
                    bw.write(" " + c);
                }
            }
        }
        bw.flush();
        bw.close();

    }
}
