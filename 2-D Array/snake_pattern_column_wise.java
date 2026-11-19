public class snake_pattern_column_wise {
    static void main() {
        int [][] a = {{2,8,4,3,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        for(int  j = 0; j<a[0].length; j++){
            if(j%2==0) {
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();

            }else{

            }



        }




    }
}
