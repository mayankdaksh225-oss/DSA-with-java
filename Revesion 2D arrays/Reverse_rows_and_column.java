import jdk.swing.interop.SwingInterOpUtils;

public class Reverse_rows_and_column {
    static void main() {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        // REVERSE ROWS
        System.out.println("ROW WISE REVERSE");
        for(int i = 0; i<arr.length; i++){
            for(int j = arr[0].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // COLUMN REVERSE
        System.out.println("COLUMN WISE REVERSE");
        for(int i = arr[0].length-1; i>=0; i--){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
