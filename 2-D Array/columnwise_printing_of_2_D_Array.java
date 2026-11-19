public class columnwise_printing_of_2_D_Array {
    static void main() {
        int [][] a = {{1,2,3,4},{4,3,8,1},{9,0,4,4}};
        System.out.println(" Normal Matrix");
        for(int []row: a){
            for(int value: row){
                System.out.print(value+" ");
            }
            System.out.println();
        }


        System.out.println("Transposed Matrix");
        for(int j = 0; j<a[0].length; j++){
            for(int i = 0; i<a.length;  i++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
