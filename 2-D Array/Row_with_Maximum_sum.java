public class Row_with_Maximum_sum {
    static void main() {
//        int [][] a = {{1,2,3,4},{4,38,8,1},{9,0,4,4}};
        int [][] a = {{1440,277,35659,4},{4,3,82,100000},{9684,9084,94,844}};

        int index = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<a.length; i++){
            int sum = 0;
            for(int j = 0;j<a[0].length; j++){
                sum+=a[i][j];
            }
            if(sum>max){
                max = sum;
                index = i;
            }
        }
        System.out.println("Greatest is: "+max+" of row "+index);

    }
}
