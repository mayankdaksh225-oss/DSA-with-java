public class Arrays {
    static void main() {
//        int [][] arr = new int [3][2];
        int [] []arr = {{1,2,3},{4,5,6,9,0},{7,8,9}};
        int a = 1;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        // For any individual row or column
//        for(int i= 0;i<arr[1].length; i++) {
//            System.out.print(arr[1][i]+" ");
//        }
    }
}
