import java.util.ArrayList;

public class Multiply_matrices {
    static void main() {

        int [][] arr1 = {{1,2,3},{4,5,6}};
        int [][] arr2 = {{1,2},{3,4},{5,6}};
        int n = arr1.length; int m = arr2[0].length;
        int [][] mat = new int[n][m];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++ ) {
               int sum = 0;
                for (int k = 0; k < m; k++) {
                    sum += (arr1[i][k] * arr2[k][j]);
                }
                mat[i][j]=sum;
            }
        }
        for(int []ele:mat){
            for(int val:ele){
                System.out.print(val+" ");
            }
            System.out.println();
        }




    }
}
