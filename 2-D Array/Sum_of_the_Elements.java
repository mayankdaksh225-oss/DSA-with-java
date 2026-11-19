public class Sum_of_the_Elements {
    static void main() {
        int [][] a = {{1,2,3,4},{4,3,2,1},{9,0,9,8}};
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                sum+= a[i][j];
            }

        }

        // BY FOR EACH LOOP
//        for(int []row: a){
//            for(int value:row){
//                sum +=value;
//            }
//        }
        System.out.println("The sum is = "+sum);
    }
}
