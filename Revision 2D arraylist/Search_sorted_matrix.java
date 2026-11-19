public class Search_sorted_matrix {
    static void main() {
        int [][] arr = {{3,30,38},{20,52,54},{35,60,69}};
        Boolean flag = false;
        int r = arr.length;
        int c = arr[0].length;
        int x = 62;
        int i = 0;
        int j = c-1;
        while(i<r && j>=0){
           if(arr[i][j]>x){
               j--;
           }else if(arr[i][j]<x){
               i++;
           }else{
               flag = true;
               break;
           }
        }
        System.out.println(flag);

    }
}
