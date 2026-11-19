public class Basics_input_and_Output {
    static void main() {


        // FOR INPUT AND OUTPUT
//        Scanner input = new Scanner(System.in);
//        int r = input.nextInt();
//        int c = input.nextInt();
//        int [][]arr = new int[r][c];
//
//        for(int i = 0; i<arr.length; i++){
//            for(int j = 0; j<arr[0].length; j++){
//                arr[i][j] = input.nextInt();
//            }
//        }
//
//        for(int i = 0; i<arr.length; i++){
//            for(int j = 0; j<arr[0].length; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        // FOR NORMALLY PRINT AN 2-D ARRAY BY LOOP
        int [][] arr2 = {{1,2,3,4},{4,3,2,1},{9,0,9,8}};
//        for(int i = 0; i<arr2.length; i++){
//            for(int j = 0; j<arr2[0].length; j++){
//                System.out.print(arr2[i][j]+" ");
//            }
//            System.out.println();
//        }

        // BY FOR EACH LOOP
        for(int []ele: arr2){
            for(int value: ele){
                System.out.print(value+" ");

            }
            System.out.println();
        }
    }
}
