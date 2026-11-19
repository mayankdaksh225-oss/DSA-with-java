public class Maximum_Element {
    static void main() {
        int [][] a = {{1440,277,35659,4},{4,3,82,100000},{9684,9084,94,844}};
        int max = Integer.MIN_VALUE;

        // FOR ONLY MAXIMUM ELEMENT
//        for(int []row: arr2){
//            for(int value: row) {
//                if (value > max) {
//                    max = value;
//                }
//            }
//        }


        // FOR PRINT INDEX TOO
        int index = 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0 ; j<a[0].length; j++){
                if (a[i][j] > max) {
                    max = a[i][j];
                    index = i;
                }

            }

        }
        System.out.println("Greatest element is: "+max+" of "+ index+" index");
    }
}
