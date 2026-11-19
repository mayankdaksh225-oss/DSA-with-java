public class Find_Min_of_Maximum {
    static void main() {
        int [][] a = {{1,2,3,44},{4,38,8,1},{9,0,4,4}};
        int index = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<a.length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<a[0].length; j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
            if(max<min){
                min = max;
                index = i;
            }
        }
        System.out.println("Minimum element is: "+min+" of row "+index);
    }
}
