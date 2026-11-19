public class Transpose_of_a_Matrix {
    static void main() {
        int [][] a = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};

        for(int []row: a){
            for(int value: row){
                System.out.print(value+" ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<=i; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for(int []row: a){
            for(int value: row){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
