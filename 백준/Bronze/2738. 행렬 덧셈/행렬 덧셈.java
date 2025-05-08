
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Solution2738.solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] condition = br.readLine().split(" ");
        int row = Integer.parseInt(condition[0]);
        int col = Integer.parseInt(condition[1]);


        int[][] matrix = new int[row][col];
        for (int i = 0; i < row * 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int matrixRow = i % row;
            for (int j = 0; j < col; j++) {
                int value = Integer.parseInt(st.nextToken());
                matrix[matrixRow][j] += value;
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                bw.write(matrix[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();


    }

}

