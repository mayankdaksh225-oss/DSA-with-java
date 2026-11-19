import java.util.Scanner;

public class Snake_pattern_columnwise {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = input.nextInt();
        System.out.print("Column: ");
        int c = input.nextInt();
        int [][] arr = new int [r][c];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }

        //Snake pattern code
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++){
                if(j%2!=0){
                    System.out.print(arr[r-1][j]+"  ");
                }else{
                    System.out.print(arr[i][j]+"  ");
                }

            }

            r--;
            System.out.println();
        }

    }
}
