public class Push_all_Zeroes_to_end {
    public static void main(String[] args) {
        // Sorting by bubble sort
        int [] arr = {1,4,5,3,3,0,8,6,9,0,12,0};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1; j++){
                if(arr[j]>arr[j+1] && arr[j+1]!=0 || arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
