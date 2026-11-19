public class Move_all_zeroes_to_end {
    static void main() {
        int [] arr = {0,1,0,3,12};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] == 0 && arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i] != 0 && arr[j] !=0 ) {
                i++;
            }
            if(arr[i] !=0 && arr[j] == 0){
                i++;
                j--;
            }

        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
