public class Snake_Pattern {
    static void main() {
        int [][] a = {{2,8,3,4,7,},{3,6,1,2,7},{5,5,4,1,4},{6,2,8,1,3}};


        for(int []ele: a){
            for(int value: ele){
                System.out.print(value+" ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i<a.length; i++){
            if(i%2 == 0){
                for(int j = 0; j<a[0].length; j++){
                    System.out.print(a[i][j]+" ");
                }
            }else{
                for(int j=a[0].length-1; j>=0; j--){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();

        }

    }
}
