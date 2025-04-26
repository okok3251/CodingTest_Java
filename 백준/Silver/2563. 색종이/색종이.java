
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution2563.solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int max_X = 0;
        int max_Y = 0;

        ArrayList<int[]> coordinate = new ArrayList<>();
        for(int i=0; i<T; i++){
            int[] xy = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            coordinate.add(xy);
            int x = xy[0]+10;
            int y = xy[1]+10;
            if(x > max_X){
                max_X = x;
            }
            if(y > max_Y){
                max_Y = y;
            }
        }
        int[][] boundary = new int[max_Y][max_X];
        for(int[] coor : coordinate){
            int sx = coor[0];
            int sy = coor[1];

            for(int i = sx; i < sx+10; i++){
                for(int j = sy; j < sy+10; j++) {
                    boundary[j][i] += 1;
                }
            }
        }

        int count = 0;
        for(int i=0; i<boundary.length; i++){
            for(int j=0; j<boundary[i].length; j++){
                if( boundary[i][j] >=1){
                    count++;
                }
            }
        }
        bw.write( count +"");
        bw.flush();
        bw.close();


    }

}

